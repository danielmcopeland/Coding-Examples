package com.daugherty;

public interface IInterestRule {
    public boolean isRuleApplicable(int yearOfCreation, double balance);
    public double getInterestRate();
}
