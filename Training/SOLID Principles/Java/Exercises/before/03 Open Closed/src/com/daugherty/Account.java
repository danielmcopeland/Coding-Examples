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
        this.interestRate = this.calculateInterestRate(yearOfCreation, balance);
    }

    private double calculateInterestRate(int yearOfCreation, double balance) {
        if(balance > 1000000) {
            return 2.1;
        } else if(yearOfCreation < 2010) {
            return 0.1;
        } else {
            return 0.01;
        }
        // What if we wanted to modify it
        // to give an interest rate of 1.4% for clients with a balance > 500,000
        // without modifying anything else or having to recompile this class?
    }

}
