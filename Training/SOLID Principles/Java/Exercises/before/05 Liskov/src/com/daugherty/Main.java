package com.daugherty;

public class Main {

    public static void main(String[] args) {

        QuadraticEquation equation = new QuadraticEquation();
        equation.setA(2);
        equation.setB(10);
        equation.setC(5);

        double[] solutions = equation.solve();

        System.out.println("Solutions for the equation "
                + equation.getA() + "x2 + " + equation.getB() + "x + " + equation.getC());
        for(int i = 0; i < solutions.length; i++) {
            System.out.println(solutions[i]);
        }

        // We should be able to substitue the previous base class (supertype) with a subtype class and obtain the same results...

        QuadraticEquation linearEquation = new LinearEquation();
        linearEquation.setA(2);
        linearEquation.setB(10);
        linearEquation.setC(5);

        double[] solutionsForSameParameters = linearEquation.solve();

        System.out.println("Solutions for the (same?) equation "
                + linearEquation.getA() + "x2 + " + linearEquation.getB() + "x + " + linearEquation.getC());
        for(int i = 0; i < solutionsForSameParameters.length; i++) {
            System.out.println(solutionsForSameParameters[i]);
        }

    }
}
