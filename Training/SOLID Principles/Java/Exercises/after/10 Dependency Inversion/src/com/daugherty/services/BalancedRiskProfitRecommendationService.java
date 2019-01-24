package com.daugherty.services;

import com.daugherty.datalayer.HardcodedInvestmentLoader;
import com.daugherty.datalayer.IInvestmentLoader;
import com.daugherty.model.Investment;

import java.util.ArrayList;

public class BalancedRiskProfitRecommendationService implements IRecommendationService {


    private ArrayList<IRecommendationRule> ruleList;
    private IInvestmentLoader investmentLoader;


    public BalancedRiskProfitRecommendationService() {
        this.investmentLoader = new HardcodedInvestmentLoader();

        this.ruleList = new ArrayList<IRecommendationRule>();
        this.ruleList.add(new HighRiskAndProfitRule());
        this.ruleList.add(new LowRiskDecentProfitRule());
    }

    @Override
    public void addRecommendationRule(IRecommendationRule recommendationRule) {
        this.ruleList.add(recommendationRule);
    }

    @Override
    public ArrayList<Investment> findAllRecommendedInvestments() {
        Investment[] allInvestments = this.investmentLoader.getAllInvestments();
        ArrayList<Investment> recommendedInvestments = new ArrayList<Investment>();
        for(int i = 0; i < allInvestments.length; i++) {
            Investment currentInvestment = allInvestments[i];
            if(this.isInvestmentRecommended(currentInvestment)) {
                recommendedInvestments.add(currentInvestment);
            }
        }
        return recommendedInvestments;
    }

    private boolean isInvestmentRecommended(Investment investment) {
        for(int i = 0; i < this.ruleList.size(); i++) {
            IRecommendationRule currentRule = this.ruleList.get(i);
            if(currentRule.isInvestmentRecommended(investment)) {
                return true;
            }
        }

        // No match with any rule means it isn't recommended
        return false;
    }
}
