using System;

namespace SimpleCalculator
{
  public class MathOperationFactoryImpl : MathOperationFactory
  {
    public MathOperation GetMathOperation(string op)
    {
      switch (op)
      {
        case "+":
          return new AddMathOperation();
        case "-":
          return new SubtractMathOperation();
        case "*":
          return new MultiplyMathOperation();
        case "/":
          return new DivideMathOperation();
        default:
          throw new ArgumentException("'" + op + "' is not a recognized operation");
      }
    }
  }
}