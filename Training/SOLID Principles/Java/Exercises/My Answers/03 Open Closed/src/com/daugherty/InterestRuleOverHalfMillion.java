package com.daugherty;

public class InterestRuleOverHalfMillion extends InterestRuleDefault {
    @Override
    public boolean doesRuleApply(int yearOfCreation, double balance) {
        return balance > 500000;
    }

    @Override
    public double getInterestRate() {
        return 1.4;
    }
}
