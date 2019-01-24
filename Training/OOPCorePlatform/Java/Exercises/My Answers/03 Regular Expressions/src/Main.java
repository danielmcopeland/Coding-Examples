import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		// TODO: Use a regular expression to replace all whitespace with a single space 
		String s1 = "this   string   has a lot   of extra spaces";
		s1 = s1.replaceAll("\\s+"," ");
		System.out.println(s1);
		
		
		// TODO: Use the String.split method and a regular expression to split the comma separated values in the string below
		// and display each part
		String s2 = "a, ab , abc, abcd  , abcde";
		String[] splitStr = s2.split("\\s*, ");
		for (String s:splitStr) {
			System.out.println(s);
		}
		// TODO: Use the Pattern and Matcher classes to find and display all the e-mail addresses in the string below
		String s3 = "Emails: joe@yahoo.com; matt@gmail.com, test@daugherty.com, test@johnevneisn";
		String[] emails = s3.split("[,;:] ");
		for (String e:emails) {
			if(e.matches("[a-z0-9_\\.-]+@[a-z0-9_\\.-]+\\.[a-z\\.]{2,6}")) System.out.println(e);
		}


	}
}