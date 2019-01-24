package com.daugherty.services;

import com.daugherty.model.Investment;

public class HighRiskAndProfitRule implements IRecommendationRule {

    @Override
    public boolean isInvestmentRecommended(Investment investment) {
        return (investment.getRiskLevel() < 75 && investment.getReturnRatio() > 150);
    }
}
