package com.daugherty.gui;

import com.daugherty.model.Investment;
import com.daugherty.services.BalancedRiskProfitRecommendationService;
import com.daugherty.services.IRecommendationService;

import java.util.ArrayList;

public class RecommendedInvestmentDisplayGUI implements IRecommendedInvestmentDisplayGUI {

    private IRecommendationService recommendationService;

    public RecommendedInvestmentDisplayGUI() {
        this.recommendationService = new BalancedRiskProfitRecommendationService();
    }

    public void displayRecommendedInvestments() {
        // (Other implementations may not echo the results to the console in plain text, or may present them with a different look)
        ArrayList<Investment> recommendedInvestments = this.recommendationService.findAllRecommendedInvestments();
        System.out.println("Recommended investments");
        System.out.println("-----------------------");
        for(int i = 0; i < recommendedInvestments.size(); i++) {
            System.out.println(recommendedInvestments.get(i).getDescription());
        }
    }
}
