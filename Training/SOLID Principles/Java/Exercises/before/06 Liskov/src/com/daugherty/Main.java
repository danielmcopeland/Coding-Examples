package com.daugherty;

public class Main {

    public static void main(String[] args) {
        int sideOneLength = 10;
        int sideTwoLength = 5;
        int sideThreeLength = 7;

        Triangle myTriangle = new Triangle();
        myTriangle.setSideOneLength(sideOneLength);
        myTriangle.setSideTwoLength(sideTwoLength);
        myTriangle.setSideThreeLength(sideThreeLength);

        int myTrianglePerimeter = myTriangle.getPerimeter();
        System.out.println("The perimeter of my triangle is: " + myTrianglePerimeter);

        // An EquilateralTriangle IS A Triangle. Can we get the same results if we substitute it?

        Triangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.setSideOneLength(sideOneLength);
        equilateralTriangle.setSideTwoLength(sideTwoLength);
        equilateralTriangle.setSideThreeLength(sideThreeLength);

        int equilateralTrianglePerimeter = equilateralTriangle.getPerimeter();
        System.out.println("The perimeter of my equilateral triangle is: " + equilateralTrianglePerimeter);
    }
}
