package Lesson11;

/**
 * Created by Gerka on 01-Apr-18.
 */
public class Main {
    public static void main(String[] args) {
        Shape sh = new Shape("Black");
        System.out.println(sh.toString());

        Circle ci1 = new Circle("Green");
        System.out.println(ci1.toString());

        Circle ci2 = new Circle("Blue", 24.11);
        System.out.print(ci2.toString());
        System.out.println(". Area: " + ci2.calcArea());

        Rectangle r = new Rectangle("Blue", 14.11, 5.66);
        System.out.print(r.toString());
        System.out.println(". Area: " + r.calcArea());

        Triangle t = new Triangle("Red", 14.11, 10.66, 8.67);
        System.out.print(t.toString());
        System.out.println(". Area: " + t.calcArea());

        System.out.println();

        Shape[] arr = new Shape[]{new Circle("Red", 2.5), new Rectangle("Green", 2.0, 2.5),
                new Rectangle("Yello", 3.0, 2.0), new Triangle("Blue")};
        double sumArea = 0.0;
        double sumRect = 0.0;
        double sumCirc = 0.0;
        double sumTria = 0.0;
        for (Shape i : arr) {
            System.out.print(i.toString());
            System.out.println(". Area: " + i.calcArea());
            sumArea += i.calcArea();
            if (i instanceof Rectangle) {
                sumRect += i.calcArea();
            }
            if (i instanceof Circle) {
                sumRect += i.calcArea();
            }
            if (i instanceof Triangle) {
                sumRect += i.calcArea();
            }
        }
        System.out.println("The total area of all the figures: " + sumArea);
        System.out.println("    Rectangles total area: " + sumRect);
        System.out.println("    Circles total area: " + sumCirc);
        System.out.println("    Triangles total area: " + sumTria);
    }
}
