package Lesson5;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem905 {
//    What type of triangle?
//    https://www.e-olymp.com/en/problems/905
//
//    Find the triangle type (equilateral, isosceles, scalene) if the lengths of its sides are given.
//    Input
//    One line contains 3 integers - the lengths of triangle sides. The lengths of the sides do not exceed 100.
//    Output
//    Print 1 if the triangle is equilateral, 2 if isosceles and 3 if scalene.

    public static void main(String[] args) {
        double a = 5;
        double b = 5;
        double c = 5;

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("No such triangle exists: all the sides must be greater than 0");
        }
        else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("No such triangle exists: 2 sides can't be less than the 3rd one");
        }
        else {
            if (a == b && b == c) {
                System.out.println("The triangle is equilateral");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("The triangle is isosceles");
            }
            else {
                System.out.println("The triangle is scalene");
            }
        }
    }
}
