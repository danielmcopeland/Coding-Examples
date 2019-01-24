package com.daugherty;

import java.util.ArrayList;

public class RecommendedInvestmentDisplayGUI {

    public void displayRecommendedInvestments() {
        ArrayList<Investment> recommendedInvestments = this.findAllRecommendedInvestments();
        System.out.println("Recommended investments");
        System.out.println("-----------------------");
        for(int i = 0; i < recommendedInvestments.size(); i++) {
            System.out.println(recommendedInvestments.get(i).getDescription());
        }
    }

    public ArrayList<Investment> findAllRecommendedInvestments() {
        Investment[] allInvestments = this.getAllInvestments();
        ArrayList<Investment> recommendedInvestments = new ArrayList<Investment>();
        for(int i = 0; i < allInvestments.length; i++) {
            Investment currentInvestment = allInvestments[i];
            if(this.isInvestmentRecommended(currentInvestment)) {
                recommendedInvestments.add(currentInvestment);
            }
        }
        return recommendedInvestments;
    }

    public boolean isInvestmentRecommended(Investment investment) {
        int riskLevel = investment.getRiskLevel();
        double returnRatio = investment.getReturnRatio();

        if(riskLevel < 75 && returnRatio > 150) {
            // High risk, highly profitable investment
            return true;
        }

        if(riskLevel < 10 && returnRatio > 6) {
            // Low risk, decent profit investment
            return true;
        }

        // Anything else isn't recommended with the current rules
        return false;
    }

    public Investment[] getAllInvestments() {
        // Would connect to a database and get a list of all possible investments
        return new Investment[] {
                new Investment("Risky business", 100, 200),
                new Investment("Startup", 50, 175),
                new Investment("Savings account", 1, 2),
                new Investment("Stocks account", 8, 7),
                new Investment("High-frequency trading", 40, 20)
        };
    }

}
