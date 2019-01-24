package com.daugherty;

public class InterestRuleOverMillion implements IInterestRule {

    @Override
    public boolean isRuleApplicable(int yearOfCreation, double balance) {
        return (balance > 1000000);
    }

    @Override
    public double getInterestRate() {
        return 2.1;
    }
}
