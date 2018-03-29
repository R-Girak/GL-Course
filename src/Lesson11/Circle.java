package Lesson11;

/**
 * Created by roman.girak on 22/03/2018.
 */
public abstract class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor) {
        super(shapeColor);
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        //return "This is a Circle. Color: " + super.getShapeColor() + ". Radius: " + radius;
        return  super.toString();
    }
}
