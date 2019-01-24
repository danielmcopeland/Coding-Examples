

public class DivideMathOperation implements MathOperation{

	public double calculate(double num1, double num2) throws ArithmeticException {
		if(num2 == 0) {
			throw new ArithmeticException("Can't divide by zero");
		}
		double result = num1 / num2;
		return result;
	}

}
