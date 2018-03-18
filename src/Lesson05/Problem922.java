package Lesson05;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem922 {
//    Shift the elements
//    https://www.e-olymp.com/en/problems/922
//
//    The linear array of n integers is given. Shift its elements cyclically one position to the right.
//    Input
//    The number of elements n (n ≤ 100) in array is given in the first line. The second line contains n elements of array, each of them does not exceed 100 by absolute value.
//    Output
//    Print n numbers in one line - the new array elements.

    public static void main(String[] args) {
        int[] arr = {15, 66, -93, -16, 18, 0, 23};
        int switcher = 0;

        for (int i = 1; i < arr.length; i++) {
            switcher = arr[0];
            arr[0] = arr[i];
            arr[i] = switcher;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
