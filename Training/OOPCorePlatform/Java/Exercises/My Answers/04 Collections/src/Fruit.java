
// TODO: implement the Comparable interface to compare fruit by name
public class Fruit implements Comparable<Fruit> {

	private String name;
	
	public Fruit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name; 
	}

	public int compareTo(Fruit o) {
		return name.compareTo(o.name);
	}
	
}
