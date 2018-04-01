package Lesson11;

/**
 * Created by Gerka on 01-Apr-18.
 */
public class Triangle extends Shape {
    private double a = 0.0;
    private double b = 0.0;
    private double c = 0.0;

    public Triangle(String shapeColor) {
        super(shapeColor);
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double ph = (a + b + c) / 2 ;
        return Math.sqrt(ph * (ph - a) * (ph - b) * (ph - c));
    }

    @Override
    public String toString() {
        return super.toString() + ". a: " + a + "; b: " + b + "; c: " + c;
    }
}
