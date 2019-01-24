package com.daugherty;

public class InterestRuleOverAmount implements IInterestRule {

    private final double thresholdAmount;
    private final double appliedInterestRate;

    public InterestRuleOverAmount(double thresholdAmount, double appliedInterestRate) {
        this.thresholdAmount = thresholdAmount;
        this.appliedInterestRate = appliedInterestRate;
    }

    @Override
    public boolean isRuleApplicable(int yearOfCreation, double balance) {
        return (balance > this.thresholdAmount);
    }

    @Override
    public double getInterestRate() {
        return this.appliedInterestRate;
    }
}
