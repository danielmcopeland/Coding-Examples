package com.daugherty;

public class QuadraticEquation {

    protected int a; // ax2, quadratic coefficient
    protected int b; // bx, linear coefficient
    protected int c; // c, constant

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public double[] solve() {
        double squareRootCalculation = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        double root1 = (-b + squareRootCalculation) / (2 * a);
        double root2 = (-b - squareRootCalculation) / (2 * a);

        double[] solutions = new double[] {root1, root2};

        return solutions;
    }

}
