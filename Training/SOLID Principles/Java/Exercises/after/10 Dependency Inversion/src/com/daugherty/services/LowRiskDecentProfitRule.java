package com.daugherty.services;

import com.daugherty.model.Investment;

public class LowRiskDecentProfitRule implements IRecommendationRule {

    @Override
    public boolean isInvestmentRecommended(Investment investment) {
        return (investment.getRiskLevel() < 10 && investment.getReturnRatio() > 6);
    }
}
