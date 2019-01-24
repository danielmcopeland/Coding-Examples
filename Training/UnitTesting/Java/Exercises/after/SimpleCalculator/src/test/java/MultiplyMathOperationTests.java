import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MultiplyMathOperationTests {
	
	private MultiplyMathOperation target;
	
	@Before
	public void init() {
		target = new MultiplyMathOperation();
	}
	
	@Test 
	public void calculate_multipliesNumbers_test() {
		Assert.assertEquals(0, target.calculate(2, 0), 0);
		Assert.assertEquals(156.25, target.calculate(12.5, 12.5), 0);
		Assert.assertEquals(62356, target.calculate(238, 262), 0);
		Assert.assertEquals(-20, target.calculate(-10, 2), 0);
		Assert.assertEquals(1093139630, target.calculate(14582, 74965), 0);
		Assert.assertEquals(1000, target.calculate(-20, -50), 0);
		Assert.assertEquals(1.15, target.calculate(5, .23), .01);
	}

}
