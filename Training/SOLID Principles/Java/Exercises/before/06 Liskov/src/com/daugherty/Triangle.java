package com.daugherty;

public class Triangle {

    protected int sideOneLength;
    protected int sideTwoLength;
    protected int sideThreeLength;

    public int getSideOneLength() {
        return sideOneLength;
    }

    public void setSideOneLength(int sideOneLength) {
        this.sideOneLength = sideOneLength;
    }

    public int getSideTwoLength() {
        return sideTwoLength;
    }

    public void setSideTwoLength(int sideTwoLength) {
        this.sideTwoLength = sideTwoLength;
    }

    public int getSideThreeLength() {
        return sideThreeLength;
    }

    public void setSideThreeLength(int sideThreeLength) {
        this.sideThreeLength = sideThreeLength;
    }

    public Triangle() {

    }

    public int getPerimeter() {
        return sideOneLength + sideTwoLength + sideThreeLength;
    }

}
