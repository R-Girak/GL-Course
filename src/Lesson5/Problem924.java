package Lesson5;

/**
 * Created by Gerka on 18-Feb-18.
 */
public class Problem924 {
//    Ring
//    https://www.e-olymp.com/en/problems/924
//
//    The area of a ring and radius of an external circle are given. Find the radius of an internal circle.
//    Input
//    Two real numbers are given: the area of a ring and the radius of an external circle, which does not exceed 100.
//    Output
//    Print the radius of an internal circle with 2 digits after the decimal point.

    public static void main(String[] args) {
        double s = 25.0;
        double r1 = 5.5;
        double r2;

        r2 = Math.sqrt(r1*r1 - s/Math.PI);

        System.out.println(r2);

    }
}
