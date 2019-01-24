package com.daugherty;

public class InterestRuleDefault implements IInterestRule {

    @Override
    public boolean isRuleApplicable(int yearOfCreation, double balance) {
        return true; // Applies to any account
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }
}
