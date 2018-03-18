package Lesson05;

/**
 * Created by roman.girak on 12/02/2018.
 */
public class Problem914 {
//    Maximum of absolute values
//    https://www.e-olymp.com/en/problems/914
//
//    The sequence of real numbers is given. Lets find their absolute values.
//    Find the maximum value among these absolute values.
//    Input
//    First line contains the number n (n ≤ 100) of elements in the sequence.
//    Next line gives n real numbers - the elements of the sequence, which values do not exceed 100 by absolute value.
//    Output
//    Print the maximum value among the absolute values of given numbers with 2 digits after the decimal point.
    public static void main(String[] args) {
        double [] arr = {15.0, 66.6, -9.3, -1.6, 1.8, 0.0} ;
        double max = 0;
        int noOfMax = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                arr[i] *= -1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                noOfMax = i;
                max = arr[i];
            }
        }
        System.out.println("The max element is no " + (noOfMax + 1) + " and it's value is: " + max);
    }
}
