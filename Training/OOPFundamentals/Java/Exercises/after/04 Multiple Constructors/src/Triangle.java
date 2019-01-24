public class Triangle {

    // Length of the three sides of the triangle
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(float sideLength) {
        this(sideLength, sideLength, sideLength);
    }

    public float calculatePerimeter() {
        return this.a + this.b + this.c;
    }
}

