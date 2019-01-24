package com.daugherty;

public class InterestRuleOlderTwentyTen implements IInterestRule {

    @Override
    public boolean isRuleApplicable(int yearOfCreation, double balance) {
        return (yearOfCreation < 2010);
    }

    @Override
    public double getInterestRate() {
        return 0.1;
    }
}
