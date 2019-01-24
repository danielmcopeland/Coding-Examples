package com.daugherty;

public interface IInterestCalculator {

    public void addRule(IInterestRule rule);
    public double calculateInterest(int yearOfCreation, double balance);

}
