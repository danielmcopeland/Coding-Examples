package com.daugherty;

public class InterestRuleOverOneMillion extends InterestRuleDefault  {
    @Override
    public boolean doesRuleApply(int yearOfCreation, double balance) {
        return balance > 1000000;
    }

    @Override
    public double getInterestRate() {
        return 2.1;
    }
}
