package com.daugherty;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class InterestCalculator implements IInterestCalculator {
    private ArrayList<IInterestRule> ruleList;

    public InterestCalculator() {
        this.ruleList = new ArrayList<>();
        this.addRule(new InterestRuleOverHalfMillion());
        this.addRule(new InterestRulePreTwentyTen());
        this.addRule(new InterestRuleOverOneMillion());
        this.addRule(new InterestRuleDefault());

        logInterestOrder();
    }

    @Override
    public void addRule(IInterestRule rule) {
        this.ruleList.add(rule);
        ruleList.sort(new Comparator<IInterestRule>() {
            @Override
            public int compare(IInterestRule o1, IInterestRule o2) {
                double percent1 = o1.getInterestRate();
                double percent2 = o2.getInterestRate();
                return percent1 > percent2 ? -1 : 1;
            }
        });
    }

    @Override
    public double calculateInterest(int yearOfCreation, double balance) {
        for(IInterestRule rule:ruleList) {
            if (rule.doesRuleApply(yearOfCreation, balance)) {
                return rule.getInterestRate();
            }
        }
        return 0;
    }

    public void logInterestOrder() {
        for (IInterestRule iRate: ruleList) {
            System.out.println(iRate.getInterestRate());
        }
    }
}
