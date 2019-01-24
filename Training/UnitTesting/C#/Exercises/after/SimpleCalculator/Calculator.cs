using System;

namespace SimpleCalculator
{
  public class Calculator
  {
    private MathOperationFactory factory;

    public Calculator(MathOperationFactory factory) => this.factory = factory;

    public double Calculate(double num1, double num2, String op)
    {
      MathOperation operation = factory.GetMathOperation(op);
      return operation.Calculate(num1, num2);
    }
  }
}
