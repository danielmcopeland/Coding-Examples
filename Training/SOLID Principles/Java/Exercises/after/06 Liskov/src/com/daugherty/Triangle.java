package com.daugherty;

public class Triangle implements Shape {

    private int sideOneLength;
    private int sideTwoLength;
    private int sideThreeLength;

    public Triangle(int sideOneLength, int sideTwoLength, int sideThreeLength) {
        this.sideOneLength = sideOneLength;
        this.sideTwoLength = sideTwoLength;
        this.sideThreeLength = sideThreeLength;
    }

    public int getPerimeter() {
        return sideOneLength + sideTwoLength + sideThreeLength;
    }

}
