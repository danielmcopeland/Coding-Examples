import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTests {

	private MathOperation mockMathOperation;
	private MathOperationFactory mockMathOperationFactory;
	private Calculator target;
	
	@Before
	public void init() {
		
		mockMathOperation = Mockito.mock(MathOperation.class);
		mockMathOperationFactory = Mockito.mock(MathOperationFactory.class);
		target = new Calculator(mockMathOperationFactory);
	}
	
	@Test
	public void calculate_executesMathOperation_test() {
		//-----------
		// Setup
		//-----------
		double num1 = 2;
		double num2 = 3;
		String op = "+";
		double expectedResult = 5;
		
		Mockito.when(mockMathOperation.calculate(num1, num2))
			.thenReturn(expectedResult);
		
		Mockito.when(mockMathOperationFactory.getMathOperation(op))
			.thenReturn(mockMathOperation);
		
		//-----------
		// Act
		//-----------
		double actualResult = target.calculate(num1, num2, op);
		
		//-----------
		// Assert
		//-----------
		Assert.assertEquals(expectedResult, actualResult, 0);
		Mockito.verify(mockMathOperation).calculate(num1, num2);
		Mockito.verify(mockMathOperationFactory).getMathOperation(op);
	}

}
