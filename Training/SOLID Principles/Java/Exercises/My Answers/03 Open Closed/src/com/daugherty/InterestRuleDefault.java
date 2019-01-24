package com.daugherty;

public class InterestRuleDefault implements IInterestRule {

    public String name;



    @Override
    public boolean doesRuleApply(int yearOfCreation, double balance) { return true; }

    @Override
    public double getInterestRate() { return 0.01; }

}
