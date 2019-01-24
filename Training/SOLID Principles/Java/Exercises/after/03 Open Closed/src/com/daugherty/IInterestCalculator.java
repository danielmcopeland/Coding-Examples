package com.daugherty;

import java.util.ArrayList;

public interface IInterestCalculator {
    public void addRule(IInterestRule rule);
    public double calculateInterest(int yearOfCreation, double balance);
}
