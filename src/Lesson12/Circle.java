package Lesson12;

/**
 * Created by roman.girak on 22/03/2018.
 */
public class Circle extends Shape {

    private double radius = 0.0;

    public Circle(String shapeColor) {
        super(shapeColor);
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        //return "This is a Circle. Color: " + super.getShapeColor() + ". Radius: " + radius;
        return super.toString() + ". Radius: " + radius;
    }

    @Override
    public void draw() {
        System.out.print(this.toString());
        System.out.println(". Area: " + this.calcArea());
    }
}
