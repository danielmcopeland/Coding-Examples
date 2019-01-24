import com.daugherty.gadgets.CalculatorWatch;

public class Main {

	public static void main(String[] args) {
		CalculatorWatch calculatorWatch = new CalculatorWatch();

		int addedNumbers = calculatorWatch.calculateAdd(2, 2);
		long currentUNIXTime = calculatorWatch.getUNIXEpochTime();

		System.out.println("The result of the addition is " + addedNumbers + " and the current UNIX time is " + currentUNIXTime);
		// Prints: ‘The result of the addition is 4 and the current UNIX time is 1467411884801’

	}

}
