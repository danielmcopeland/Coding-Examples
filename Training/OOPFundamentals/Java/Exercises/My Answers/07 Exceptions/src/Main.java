
public class Main {

	public static void main(String[] args) {
		Glass hugeGlass = new Glass(25.5f);

		try{
		    hugeGlass.addWater(20f);
		    hugeGlass.addWater(10f);
		} catch(GlassOverflownException e) {
		    System.out.println(e);
		    // Prints GlassOverflownException: glass capacity exceeded; you have spilt 18.5 gallons
		}

	}

}
