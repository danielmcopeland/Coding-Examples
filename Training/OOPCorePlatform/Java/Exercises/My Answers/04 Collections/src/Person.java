
public class Person {

	private String firstName;
	private String lastName;
	private String ssn;
	
	public Person(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getSsn() {
		return this.ssn;
	}
	
	// TODO: Override equals method and do a comparison using the ssn field

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false;
		return ((Person) obj).ssn.equals(this.ssn);
	}
	@Override
	public String toString() {
		return String.format("%s, %s (%s)", lastName, firstName, ssn); 
	}
}
