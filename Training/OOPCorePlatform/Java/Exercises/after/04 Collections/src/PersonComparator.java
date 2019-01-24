import java.util.Comparator;

// TODO: implement the Comparator interface to compare by a Person's last name
public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}

}
