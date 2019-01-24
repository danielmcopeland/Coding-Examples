package com.daugherty;

public class InterestRulePlatinum extends InterestRuleDefault{

    @Override
    public boolean doesRuleApply(int yearOfCreation, double balance) { return yearOfCreation == 1594; }

    @Override
    public double getInterestRate() { return 3; }
}
