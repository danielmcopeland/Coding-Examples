package com.daugherty.services;

import com.daugherty.model.Investment;

public interface IRecommendationRule {

    public boolean isInvestmentRecommended(Investment investment);

}
