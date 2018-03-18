package Lesson04;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem002 {
//    Digits
//    https://www.e-olymp.com/en/problems/2
//
//    Find the number of digits in a nonnegative integer n.
//    Input
//    One nonnegative integer n (0 ≤ n ≤ 2 *109).
//    Output
//    Print the number of digits in number n.

    public static void main(String[] args) {
        int x = 57568;
        String s;
        s = Integer.toString(x);
        System.out.println(s.length());
    }
}
