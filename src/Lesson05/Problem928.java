package Lesson05;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem928 {
//    The sum of the largest and the smallest
//    https://www.e-olymp.com/en/problems/928
//
//    The array of integers is given. Find the sum of the smallest and the largest element in array.
//    Input
//    The first line contains the number of elements n (n ≤ 100) in array. n array elements are given in the second line. Each number in array does not exceed 100 by absolute value.
//    Output
//    Print the sum of the smallest and the largest element in array.

    public static void main(String[] args) {
        int[] arr = {15, 66, -93, -16, 18, 0, 23, 94};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The sum of the smallest and the greatest ones is: " + (min + max));
    }
}
