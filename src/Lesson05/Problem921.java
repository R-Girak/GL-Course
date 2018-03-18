package Lesson05;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem921 {
//    Negative elements
//    https://www.e-olymp.com/en/problems/921
//
//    The one-dimensional array of n real numbers is given. Find the sum and the number of negative elements in array.
//    Input
//    The first line contains the number n (n ≤ 100) of elements in array. In the next line n real numbers - the elements of array are given. Their values do not exceed 100 by absolute value.
//    Output
//    Print in one line the number of negative elements and their sum with 2 digits after the decimal point.

    public static void main(String[] args) {
        double [] arr = {15.0, 66.6, -9.3, -1.6, 1.8, 0.0, -1.6, 1.8, 8.0} ;
        double sum = 0.0;
        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                number++;
                sum += arr[i];
            }
        }
        System.out.println("The number of elements is: " + number);
        System.out.println("The sum of elements is: " + sum);
    }
}
