
public class Main {

	public static void main(String[] args) {
		User sampleUser = new User();
		sampleUser.setName("Henry");
		sampleUser.setScore(1336);
		sampleUser.increaseScoreByOne();

		System.out.println("User " + sampleUser.getName() + " has a score of: " + sampleUser.getScore()); // Prints ‘User Henry has a score of: 1337’

	}

}
