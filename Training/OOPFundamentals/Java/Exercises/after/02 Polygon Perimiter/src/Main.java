
public class Main {

	public static void main(String[] args) {
		float[] polygonSideLengths = {7.5f, 10.4f, 3.7f, 16f, 20f};// A pentagon
		float perimiter = calculatePerimeter(polygonSideLengths);
		System.out.println(perimiter);
	}
	
	public static float calculatePerimeter(float[] sideLengths) {
	    float totalLength = 0;
	    for (float currentSideLength: sideLengths) {
	        totalLength += currentSideLength;
	    }

	    return totalLength;
	}
}
