package com.daugherty;

public class EquilateralTriangle implements Shape {

    private int sideLength;

    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getPerimeter() {
        return 3 * this.sideLength;
    }

}
