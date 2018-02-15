package Lesson5;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem911 {
//    Quadratic equation
//    https://www.e-olymp.com/en/problems/911
//
//    Write a program to solve a quadratic equation ax2 + bx + c = 0 (a ≠ 0).
//    Input
//    Three integers - the coefficients of quadratic equation are given in one line: a, b and c.
//    The values of coefficients do not exceed 100 by absolute value.
//    Output
//    Print in one line the message "No roots" (without quotes) if there is no roots.
//    If equation contains only one root, print "One root:" (without quotes), space and a root.
//    In the case of two roots, print "Two roots:" (without quotes), space, first smaller, and then larger root.
//    It is guaranteed that if the roots exist, they are integers.

    public static void main(String[] args) {
        double a = 2;
        double b = 13;
        double c = 5;

        if (a == 0.0 & b == 0.0) {
            System.out.println("Incorrect data entered!") ;
        }
        else if (a == 0.0 & c == 0.0) {
            System.out.println("One root: " + 0.0);
        }
        else if (a == 0.0) {
            System.out.println("One root: " + (-c / b));
        }
        else {
            if (b * b - 4 * a * c > 0.0) {
                System.out.println("Two roots: x1 = " + ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)));
                System.out.println("Two roots: x2 = " + ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)));
            } else if (b * b - 4 * a * c == 0.0) {
                System.out.println("One root: " + (-b / (2 * a)));
            } else {
                System.out.println("No roots");
            }
        }
    }
}
