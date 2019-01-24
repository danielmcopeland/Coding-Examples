import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorIntegrationTests {

	MathOperationFactoryImpl mathOperationFactory;
	Calculator target;
	
	@Before
	public void init() {
		MathOperationFactoryImpl mathOperationFactory = new MathOperationFactoryImpl();
		target = new Calculator(mathOperationFactory);
	}
	
	@Test
	public void calculate_executesMathOperation_test() {
		Assert.assertEquals(4, target.calculate(2, 2, "+"), 0);
		Assert.assertEquals(1, target.calculate(3, 2, "-"), 0);
		Assert.assertEquals(5, target.calculate(10, 2, "/"), 0);
		Assert.assertEquals(15, target.calculate(3, 5, "*"), 0);
	}
}
