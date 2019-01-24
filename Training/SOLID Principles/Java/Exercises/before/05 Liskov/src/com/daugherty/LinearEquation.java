package com.daugherty;

// 0x2 + bx + c = 0
public class LinearEquation extends QuadraticEquation {

    @Override
    public double[] solve() {
        double root = ((double)(-c) / (double)(b));
        double[] solutions = new double[] {root};
        return solutions;
    }
}
