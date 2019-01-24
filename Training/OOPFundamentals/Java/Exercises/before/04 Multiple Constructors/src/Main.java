
public class Main {

	public static void main(String[] args) {
		Triangle scaleneTriangle = new Triangle(10, 9, 7.5f);
		float scaleneTrianglePerimeter = scaleneTriangle.calculatePerimeter();
		System.out.println("Scalene triangle perimeter = " + scaleneTrianglePerimeter);
		// Prints ‘Scalene triangle perimeter = 26.5’

		Triangle equilateralTriangle = new Triangle(10);
		float equilateralTrianglePerimeter = equilateralTriangle.calculatePerimeter();
		System.out.println("Equilateral triangle perimeter = " + equilateralTrianglePerimeter);
		// Prints ‘Equilateral triangle perimeter = 30.0’

	}

}
