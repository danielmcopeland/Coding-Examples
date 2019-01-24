package com.daugherty;

public class QuadraticEquation implements IEquation {

    private int a; // ax2, quadratic coefficient
    private int b; // bx, linear coefficient
    private int c; // c, constant

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] solve() {
        double squareRootCalculation = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        double root1 = (-b + squareRootCalculation) / (2 * a);
        double root2 = (-b - squareRootCalculation) / (2 * a);

        double[] solutions = new double[] {root1, root2};

        return solutions;
    }

    public String toString() {
        return a + "x2 + " + b + "x + " + c;
    }

}
