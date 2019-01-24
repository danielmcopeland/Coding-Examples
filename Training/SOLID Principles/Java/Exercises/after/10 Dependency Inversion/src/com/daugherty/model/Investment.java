package com.daugherty.model;

public class Investment {

    private String description;

    // Risk level - 0 = best, 100 = worst
    private int riskLevel;

    // Return on investment (percent)
    private double returnRatio;

    public String getDescription() {
        return description;
    }

    public int getRiskLevel() {
        return riskLevel;
    }

    public double getReturnRatio() {
        return returnRatio;
    }

    public Investment(String description, int riskLevel, double returnRatio) {
        this.description = description;
        this.riskLevel = riskLevel;
        this.returnRatio = returnRatio;
    }

}
