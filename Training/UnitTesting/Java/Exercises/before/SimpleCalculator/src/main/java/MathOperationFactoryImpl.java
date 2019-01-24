import java.security.InvalidParameterException;

public class MathOperationFactoryImpl implements MathOperationFactory {

	public MathOperation getMathOperation(String op) {
		if(op == "+") {
			return new AddMathOperation();
		}
		if(op == "-") {
			return new SubtractMathOperation();
		}
		if(op == "/") {
			return new DivideMathOperation();
		}
		if(op == "*") {
			return new MultiplyMathOperation();
		}
		
		throw new InvalidParameterException();
	}

}
