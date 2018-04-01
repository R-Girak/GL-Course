package Lesson12;

/**
 * Created by roman.girak on 22/03/2018.
 */
abstract class Shape implements Drawable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public abstract void draw();

    abstract double calcArea();

    @Override
    public String toString() {
       // return "Shape. Color = " + shapeColor;
        return "This is: " + this.getClass().getSimpleName() + ". Color = " + shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }
}
