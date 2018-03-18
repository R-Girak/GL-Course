package Lesson04;

import static java.lang.Math.abs;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem004 {
//    Two circles
//    https://www.e-olymp.com/en/problems/4
//
//    How many points in common two given circles have? prb4
//    Input
//    Six numbers x1, y1, r1, x2, y2, r2, where x1, y1, x2, y2 are the coordinates of the centers of the circles, r1, r2 are its radii.
//    Output
//    The number of common points for two circles: 0, 1 or 2. Print -1 if circles have a lot of common points.

    public static void main(String[] args) {
        // Circle 1
        double x1 = 5;
        double y1 = 18;
        double r1 = 85;
        // Circle 2
        double x2 = 86;
        double y2 = .05;
        double r2 = 5;
        // Parameters for the calculation
        double x = 0;
        double y = 0;
        double z = 0;
        double r = 0;

        // Check that 2 circles are not the same one
        if (r1 < 0 || r2 < 0) {
            System.out.println("Incorrect radius entered: can't be less than 0");
        }
        else if (x1 == x2 && y1 == y2 && r1 == r2) {
            System.out.println("The circles are equal");
        }
        else if (x1 == x2 && y1 == y2 && r1 != r2) {
            System.out.println("No common dots (circles have the same center)");
        }
        else {
            x = abs(x1 - x2);
            y = abs(y1 - y2);
            r = r1 + r2;
            z = Math.sqrt(x * x + y * y);

            if (z + r2 < r1 || z + r1 < r2) {
                System.out.println("No common dots (1 circle is inside the other one)");
            }
            else {
                if (z == r) {
                    System.out.println("One common dot");
                }
                if (z < r) {
                    System.out.println("2 common dots");
                }
                if (z > r) {
                    System.out.println("No common dots");
                }
            }
        }
    }
}
