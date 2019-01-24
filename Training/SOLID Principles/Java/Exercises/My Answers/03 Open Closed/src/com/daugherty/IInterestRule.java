package com.daugherty;

public interface IInterestRule {

    public boolean doesRuleApply(int yearOfCreation, double balance);
    public double getInterestRate();
}
