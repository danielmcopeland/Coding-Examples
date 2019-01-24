import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivideMathOperationTests {

	private DivideMathOperation target;
	
	@Before
	public void init() {
		target = new DivideMathOperation();
	}

	@Test 
	public void calculate_divides_numbers_test() {
		Assert.assertEquals(1, target.calculate(2, 2), 0);
		Assert.assertEquals(5, target.calculate(25, 5), 0);
		Assert.assertEquals(.9083, target.calculate(238, 262), .01);
		Assert.assertEquals(-5, target.calculate(-10, 2), 0);
		Assert.assertEquals(2916.4, target.calculate(14582, 5), 0);
		Assert.assertEquals(.4, target.calculate(-20, -50), .01);
		Assert.assertEquals(1700, target.calculate(425, .25), 0);
	}

	@Test(expected = ArithmeticException.class)
	public void calculate_throws_exception_when_divideByZero_test() {
		target.calculate(10, 0);
	}
}
