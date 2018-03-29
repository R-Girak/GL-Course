package Lesson11;

/**
 * Created by roman.girak on 22/03/2018.
 */
public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        return 0;
    }

    @Override
    public String toString() {
       // return "Shape. Color = " + shapeColor;
        return this.getClass().getSimpleName() + "Shape. Color = " + shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }
}
