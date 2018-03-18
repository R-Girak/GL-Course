package Lesson04;

import java.util.Arrays;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem108 {
//    Median number
//    https://www.e-olymp.com/en/problems/108
//
//    Three different numbers a, b, c are given. Print the median number.
//    Input
//    Integers a, b, c that do not exceed 1000 by absolute value.
//    Output
//    Print the median among three numbers.

    public static void main(String[] args) {
        int a = 19;
        int b = 19;
        int c = 19;

        if (a == b && b == c) {
            System.out.println("All the numbers are equal: " + a);
        }
        else if (a == b) {
            System.out.println("No median here as a and b are equal: " + a + " and c is " + c);
        }
        else if (a == c) {
            System.out.println("No median here as a and c are equal: " + a + " and b is " + b);
        }
        else if (c == b) {
            System.out.println("No median here as b and c are equal: " + c + " and a is " + a);
        }
        else {
            int arr [] = {a, b, c};
            Arrays.sort(arr);
            System.out.println("Median here is : " + arr[1]);
        }
    }
}
