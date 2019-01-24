
public class Main {

	public static void main(String[] args) {
		double area = calculateCircleArea(15.5);
		System.out.println(area);
	}

	public static int calculateCircleArea(int a) {
		return a*Math.PI*Math.PI;
	}
}
