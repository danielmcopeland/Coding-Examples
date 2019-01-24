
import java.util.Calendar;
import java.util.Formatter;

public class Main {

	public static void main(String[] args) {
		
		//-----------------------------
		// decimals
		//-----------------------------
		int x = 10;
		int y = 20;
		
		// Example of displaying integers
		// X:10 Y:20
		//System.out.printf("", ...);       
		
		// TODO: Format number with 4 places and right justify using spaces
		// X:  10 Y:  20
		//System.out.printf("", ...);    
		
		// TODO: Format number with 4 places and pad with zeros
		// X:0010 Y:0020
		//System.out.printf("", ...); 
		
		// TODO: Format number with 4 places and left justify using spaces
		// X:10   Y:20
		//System.out.printf("", ...); 
		
		// TODO: Format number using comma separator
		// X:1,234,567
		//System.out.printf("", ...);   
		
		// TODO: Format number leaving a space placeholder for positive numbers and prefixing with - for negative numbers
		// X: 10 Y:-20
		//System.out.printf("", ...);   
		
		// TODO: Format number by placing negative numbers in parenthesis
		// X:10 Y:(20)
		//System.out.printf("", ...);   
		
		//-----------------------------
		// float
		//-----------------------------
		double pi = Math.PI;
		
		// TODO: Format floating point number to display only first 2 decimal places
		// 3.14
		//System.out.printf("", ...); 
		
		
		//-----------------------------
		// dates
		//-----------------------------
		Calendar c = Calendar.getInstance();
		c.set(2016, 8, 1, 14, 0, 0);
		
		// TODO: Display date as 'September 01, 2016 at 2pm'
		//System.out.printf("", ...); 
		
		//-----------------------------
		// toString
		//-----------------------------
		// TODO: Override the toString method in the Person class to display the name
		// as 'Doe, John'
		Person person = new Person("John", "Doe");
		//System.out.printf("", ...); 
		
	}
	
	
	
}