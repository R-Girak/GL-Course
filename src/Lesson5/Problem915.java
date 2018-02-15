package Lesson5;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem915 {
//    Rectangular or not?
//    https://www.e-olymp.com/en/problems/915
//
//    It set lengths of the sides of a triangle. Define, is this triangle rectangular?
//    Input
//    In a unique line set 3 natural numbers - lengths of the sides of a triangle.
//    Lengths of the sides do not exceed 1000.
//    Output
//    Deduce "YES" (without inverted commas), if a triangle rectangular, or "NO" (without inverted commas) otherwise.

    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        boolean isIt = false;
        // Check each pairs
        if (a*a + b*b == c*c) {
            isIt = true;
        }
        else if (a*a + c*c == b*b) {
            isIt = true;
        }
        if (c*c + b*b == a*a) {
            isIt = true;
        }
        // Output of result
        if (isIt) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
