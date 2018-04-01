package Lesson12;

/**
 * Created by Gerka on 01-Apr-18.
 */
public class Rectangle extends Shape {

    private double width = 0.0;
    private double height = 0.0;

    public Rectangle(String shapeColor) {
        super(shapeColor);
    }

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return super.toString() + ". Width: " + width + "; Height: " + height;
    }

    @Override
    public void draw() {
        System.out.print(this.toString());
        System.out.println(". Area: " + this.calcArea());
    }
}
