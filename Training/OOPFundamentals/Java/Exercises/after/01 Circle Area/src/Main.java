
public class Main {

	public static void main(String[] args) {
		double area = calculateCircleArea(15.5);
		System.out.println(area);
	}
	
	public static double calculateCircleArea(double radius) {
		if(radius <= 0) {
			return 0;
		}
		
		return (Math.PI * Math.pow(radius, 2));
	}

}
