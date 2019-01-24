package com.daugherty;

public class Account {

    private int yearOfCreation;
    private double balance;
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public Account(int yearOfCreation, double balance) {
        this.yearOfCreation = yearOfCreation;
        this.balance = balance;
        InterestCalculator accountInterestCalculator = new InterestCalculator();
        this.interestRate = accountInterestCalculator.calculateInterest(yearOfCreation, balance);
    }
}
