namespace SimpleCalculator
{
    public interface MathOperationFactory
    {
         MathOperation GetMathOperation(string op);
    }
}