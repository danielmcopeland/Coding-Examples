package com.daugherty;

public class Account {

    private int yearOfCreation;
    private double balance;
    private double interestRate;
    private int accountNumber;

    public double getInterestRate() {
        return interestRate;
    }

    public Account(int yearOfCreation, double balance) {
        this.yearOfCreation = yearOfCreation;
        this.balance = balance;
        InterestCalculator calc = new InterestCalculator();
        this.interestRate = calc.calculateInterest(yearOfCreation, balance);
    }


}
