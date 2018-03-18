package Lesson04;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem903 {
//    First or last?
//    https://www.e-olymp.com/en/problems/903
//
//    Three digit number is given. What digit is bigger: the first digit or the last digit?
//    Input
//    One three digit number.
//    Output
//    Print the bigger digit between first and last. In case of equality, print "=" (without quotes).

    public static void main(String[] args) {
        int number = 232;
        int first, last;

        first = (number - number%100) / 100;
        last = number%10;

        if (first > last) {
            System.out.println("First is greater: " + first);
        }
        else if (last > first) {
            System.out.println("Last is greater: " + last);
        }
        else {
            System.out.println("First and last are equal: " + first);
        }
    }
}
