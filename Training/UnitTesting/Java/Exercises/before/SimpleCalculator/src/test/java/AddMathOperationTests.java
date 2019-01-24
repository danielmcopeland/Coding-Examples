import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddMathOperationTests {

	private AddMathOperation target;
	
	@Before
	public void init() {
		target = new AddMathOperation();
	}

	@Test 
	public void calculate_addsNumbers_test() {
		Assert.assertEquals(2, target.calculate(2, 0), 0);
		Assert.assertEquals(25, target.calculate(12.5, 12.5), 0);
		Assert.assertEquals(500, target.calculate(238, 262), 0);
		Assert.assertEquals(-8, target.calculate(-10, 2), 0);
		Assert.assertEquals(89547, target.calculate(14582, 74965), 0);
		Assert.assertEquals(-70, target.calculate(-20, -50), 0);
	}
}