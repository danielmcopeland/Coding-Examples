package com.daugherty;

public class Main {

    public static void main(String[] args) {

        int a = 2;
        int b = 10;
        int c = 5;

        IEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double[] solutions = quadraticEquation.solve();

        System.out.println("Solutions for the equation " + quadraticEquation);
        for(int i = 0; i < solutions.length; i++) {
            System.out.println(solutions[i]);
        }

        // In a linear equation, a is always zero, and there is only a solution
        // Now both implement the same interface, but enforce different restrictions

        IEquation linearEquation = new LinearEquation(b, c);

        double[] solutionsForTwoEqualParameters = linearEquation.solve();

        System.out.println("Solutions for a different equation " + linearEquation);
        for(int i = 0; i < solutionsForTwoEqualParameters.length; i++) {
            System.out.println(solutionsForTwoEqualParameters[i]);
        }

    }
}
