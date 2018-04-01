package Lesson12;

import Lesson11.*;

/**
 * Created by Gerka on 01-Apr-18.
 */
public class Main {
    public static void main(String[] args) {

        Lesson12.Rectangle r = new Rectangle("Red");
        r.draw();

        Lesson12.Circle c = new Circle("Green");
        c.draw();

        Lesson12.Triangle t = new Triangle("Blue");
        t.draw();

    }
}
