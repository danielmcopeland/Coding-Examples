package com.daugherty;

public class Main {

    public static void main(String[] args) {
        int sideOneLength = 10;
        int sideTwoLength = 5;
        int sideThreeLength = 7;

        Shape myTriangle = new Triangle(sideOneLength, sideTwoLength, sideThreeLength);

        int myTrianglePerimeter = myTriangle.getPerimeter();
        System.out.println("The perimeter of my triangle is: " + myTrianglePerimeter);

        Shape equilateralTriangle = new EquilateralTriangle(sideOneLength);

        int equilateralTrianglePerimeter = equilateralTriangle.getPerimeter();
        System.out.println("The perimeter of my equilateral triangle is: " + equilateralTrianglePerimeter);
    }
}
