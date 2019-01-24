import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubtractMathOperationTests {

	private SubtractMathOperation target;
	
	@Before
	public void init() {
		target = new SubtractMathOperation();
	}

	@Test 
	public void calculate_subtractsNumbers_test() {
		Assert.assertEquals(2, target.calculate(2, 0), 0);
		Assert.assertEquals(0, target.calculate(12.5, 12.5), 0);
		Assert.assertEquals(24, target.calculate(262, 238), 0);
		Assert.assertEquals(-8, target.calculate(-10, -2), 0);
		Assert.assertEquals(60383, target.calculate(74965, 14582), 0);
		Assert.assertEquals(-30, target.calculate(20, 50), 0);
	}
}
