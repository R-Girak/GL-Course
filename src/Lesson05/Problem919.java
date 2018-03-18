package Lesson05;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem919 {
//    Number by 3
//    https://www.e-olymp.com/en/problems/919
//
//    The sequence of real numbers a1, a2,..., an is given. Find the sum and the number of positive elements which indexes are divisible by 3.
//    Input
//    The number of elements n (n ≤ 100) in a sequence is given in the first line. Next line contains n real numbers, each value does not exceed 100 by absolute value.
//    Output
//    Print in one line the number of required elements and their sum with 2 digits after the decimal point.

    public static void main(String[] args) {
        double [] arr = {15.0, 66.6, -9.3, -1.6, 1.8, 0.0, -1.6, 1.8, 8.0} ;
        double sum = 0.0;
        int number = 0;

        for (int i = 1; i < arr.length; i++) {
            if ((i+1)%3 == 0 && arr[i] >= 0) {
                number++;
                sum += arr[i];
            }
        }
        System.out.println("The number of elements is: " + number);
        System.out.println("The sum of such elements is: " + sum);
    }
}
