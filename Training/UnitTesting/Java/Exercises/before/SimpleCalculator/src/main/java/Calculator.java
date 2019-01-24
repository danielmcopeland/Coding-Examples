
public class Calculator {
	
	private MathOperationFactory mathOperationFactory;
	
	public Calculator(MathOperationFactory mathOperationFactory) {
		this.mathOperationFactory = mathOperationFactory;
	}
	
	public double calculate(double num1, double num2, String op) {
		MathOperation operation = this.mathOperationFactory.getMathOperation(op);
		return operation.calculate(num1, num2);
	}
}
