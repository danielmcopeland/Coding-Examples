package com.daugherty;

// 0x2 + bx + c = 0
// A Linear Equation IS-An Equation and IS-SUBSTITUTABLE-FOR an Equation
// A Linear Equation IS-A Quadratic Equation
// but it may NOT SUBSTITUTE a Quadratic Equation that uses a quadratic coefficient other than zero
public class LinearEquation implements IEquation {

    // private int a; // ax2, quadratic coefficient always zero in a linear equation
    private int b; // bx, linear coefficient
    private int c; // c, constant

    public LinearEquation(int b, int c) {
        this.b = b;
        this.c = c;
    }

    public double[] solve() {
        double root = ((double)(-c) / (double)(b));
        double[] solutions = new double[] {root};
        return solutions;
    }

    public String toString() {
        return b + "x + " + c;
    }
}
