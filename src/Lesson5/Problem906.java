package Lesson5;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem906 {
//    Product of digits
//    https://www.e-olymp.com/en/problems/906
//
//    Three digital number is given. Find the product of its digits.
//    Input
//    One three digital positive integer n.
//    Output
//    Print the product of digits in n.

    public static void main(String[] args) {
        int number = 235;
        int first, last;

        first = (number - number%100) / 100;
        last = number%10;
        System.out.println("First * Last = : " + (first*last));
    }
}
