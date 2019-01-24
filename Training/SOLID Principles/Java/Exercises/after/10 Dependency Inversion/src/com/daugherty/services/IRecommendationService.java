package com.daugherty.services;

import com.daugherty.model.Investment;

import java.util.ArrayList;

public interface IRecommendationService {

    public void addRecommendationRule(IRecommendationRule recommendationRule);

    public ArrayList<Investment> findAllRecommendedInvestments();

}
