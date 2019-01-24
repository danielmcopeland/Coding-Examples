import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		simpleArrayList();
		
		genericArrayList();
		
		overridingEqualsMethod();
		
		lambdaExpressions();
		
		convertingArrayListToArray();
		
		sortingUsingComparableInterface();
		
		sortingUsingComparatorInterface();
	}

	//-----------------------------------
	// 1. Simple ArrayList
	//-----------------------------------
	private static void simpleArrayList() {
		
		// TODO: create an ArrayList

		// TODO: add "Foo" and "Bar" strings to your ArrayList
		
		// TODO: Use the get(...) method to get the first element in the ArrayList as a String
		
	}


	//-----------------------------------
	// 2. Generic ArrayList
	//-----------------------------------
	private static void genericArrayList() {
		// TODO: Create a Generic ArrayList of type String
		
		// TODO: Add "Foo" and "Bar" strings to the list
				
		// TODO: Print out all the items in the list
		
		// TODO: Print out the size of the list
	}
	

	//-----------------------------------
	// 3. Overriding equals() method
	//-----------------------------------
	private static void overridingEqualsMethod() {
		// TODO: modify the Person class and override the equals method.
		//       Person objects with the same ssn should return true
		// HINT: In Spring Tool Suite, right click on the class name -> Source -> Override / Implement Methods
		
		
		// Adding some people to the person list
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("John", "Doe", "555-55-5555"));
		personList.add(new Person("John", "Doe", "666-66-6666"));
				
		// Remove a person from the list
		Person personToRemove = new Person("John", "Doe", "555-55-5555");
		personList.remove(personToRemove);
		
		// Display people in the person list
		System.out.println("People in personList:");
		for(Person person : personList) {
			System.out.println(person);
		}
	}

	//-----------------------------------
	// 4. Lambda expressions
	//-----------------------------------
	private static void lambdaExpressions() {
		
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("John", "Doe", "555-55-5555"));
		personList.add(new Person("Jane", "Doe", "777-77-7777"));
		System.out.println("People in list2:");
		
		// TODO: use the forEach method on the personList and a lamba expression to display
		// all the people in the personList
		
	}
	
	//-----------------------------------
	// 5. Converting ArrayList to an Array
	//-----------------------------------
	private static void convertingArrayListToArray() {

		// Constructing an ArrayList of Persons
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("John", "Doe", "555-55-5555"));
		personList.add(new Person("Jane", "Doe", "777-77-7777"));
		
		// TODO: Convert the personList to an array and then display the people
		
	}
	
	//-----------------------------------
	// 6. Sorting using Comparable interface
	//-----------------------------------
	private static void sortingUsingComparableInterface() {
		// TODO: implement the Comparable<> interface on the Fruit class and compare by the fruit name
		TreeSet<Fruit> fruits = new TreeSet<>();
		fruits.add(new Fruit("Orange"));
		fruits.add(new Fruit("Apple"));
		fruits.add(new Fruit("Pear"));
		fruits.add(new Fruit("Pineapple"));
		System.out.println("Fruits:");
		for(Fruit fruit : fruits) {
			System.out.println(fruit);
		}
	}
	
	//-----------------------------------
	// 7. Sorting using the Comparator interface
	//-----------------------------------
	private static void sortingUsingComparatorInterface() {
		// TODO: Create a new class PersonComparator and implement the Comparator interface
		// to compare by the person's last name
		TreeSet<Person> sortablePersonList = new TreeSet<>(new PersonComparator());
		sortablePersonList.add(new Person("Ted", "Zeiler", "777-77-7777"));
		sortablePersonList.add(new Person("John", "Doe", "555-55-5555"));
		sortablePersonList.add(new Person("Jane", "Day", "777-77-7777"));
		System.out.println("Sortable Person List: ");
		for(Person person : sortablePersonList) {
			System.out.println(person);
		}
	}
}