package com.daugherty;

public class InterestRuleOverHalfMillion implements IInterestRule {
    // New Rule
    @Override
    public boolean isRuleApplicable(int yearOfCreation, double balance) {
        return (balance > 500000);
    }

    @Override
    public double getInterestRate() {
        return 1.4;
    }
}
