
public class Main {

	public static void main(String[] args) {
		Employee worker = new Employee(1);
		Employee theBoss = new Manager(2);
		System.out.println("Are these employees the same? " + (worker.equals(theBoss)));
		// Prints ‘Are these employees the same? false’

		Employee anEqualBoss = new Manager(2);
		System.out.println("Are these employees the same? " + (theBoss.equals(anEqualBoss)));
		// Prints ‘Are these employees the same? true’

		System.out.println("Has The Boss admin rights? " + (theBoss.hasAdministratorRights()));
		// Prints ‘Has The Boss admin rights? True’

	}

}
