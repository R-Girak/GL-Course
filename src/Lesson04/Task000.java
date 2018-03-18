package Lesson04;

/**
 * Created by roman.girak on 08/02/2018.
 */
public class Task000 {
    public static void main(String[] args) {
        // Practice 01: 3 int numbers a, b, c. Print the max one
        int a, b, c;
        a = 17;
        b = 17;
        c = 14;

        if (a == b & b == c) {
            System.out.println("All the numbers are equal: " + a);
        }
        else if (a == b) {
            if (a > c) {
                System.out.println("a and b are equal and greatest: " + a);
            }
            else {
                System.out.println("c is the greatest: " + c);
            }
        }
        else if (a == c) {
            if (a > b) {
                System.out.println("a and c are equal and greatest: " + a);
            }
            else {
                System.out.println("b is the greatest: " + c);
            }
        }
        else if (b == c) {
            if (b > a) {
                System.out.println("b and c are equal and greatest: " + b);
            }
            else {
                System.out.println("b is the greatest: " + a);
            }
        }
        else if (a > b) {
            if (a > c) {
                System.out.println("a is the greatest: " + a);
            }
            else {
                System.out.println("c is the greatest: " + c);
            }
        }
        else {
            if (b > c) {
                System.out.println("b is the greatest: " + b);
            }
            else {
                System.out.println("c is the greatest: " + c);
            }
        }


    }
}
