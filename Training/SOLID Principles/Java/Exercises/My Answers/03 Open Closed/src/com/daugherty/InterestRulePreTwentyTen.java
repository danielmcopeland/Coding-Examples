package com.daugherty;

public class InterestRulePreTwentyTen extends InterestRuleDefault  {

    @Override
    public boolean doesRuleApply(int yearOfCreation, double balance) {
        return yearOfCreation < 2010;
    }

    @Override
    public double getInterestRate() {
        return 0.1;
    }
}
