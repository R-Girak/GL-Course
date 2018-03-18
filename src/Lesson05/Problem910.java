package Lesson05;

/**
 * Created by roman.girak on 12/02/2018.
 */
public class Problem910 {
//    The arithmetic mean of positive
//    https://www.e-olymp.com/en/problems/910
//
//    The sequence of real numbers is given. Find the arithmetic mean of positive numbers.
//    Input
//    The first line contains amount n (0 < n ≤ 100) of real numbers.
//    Next line contains n real numbers, each of them is not greater than 100 by absolute value.
//    Output
//    Print the arithmetic mean of positive numbers with 2 digits after decimal point.
//    If the positive numbers do not appear in the sequence, print "Not Found" (without quotes).

    public static void main(String[] args) {

        double sum = 0.0;
        int number = 0;
        double [] arr = {15.0, 66.6, -9.3, -1.6, 1.8, 0.0} ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                number++;
                sum += arr[i];
            }
        }
        if (number == 0) {
            System.out.println("\"Not Found\"");
        }
        else {
            System.out.println("Mean is equal to " + (sum/number));
        }
    }
}
