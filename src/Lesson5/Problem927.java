package Lesson5;

/**
 * Created by Gerka on 18-Feb-18.
 */
public class Problem927 {
//    Number of toys
//    https://www.e-olymp.com/en/problems/927
//
//    You are given the number of kinds of the toys in the shop,
//    the number of toys of each kind and cost of a toy of each kind.
//    Find the number of toys with cost less than 50 grn.
//    Input
//    The first line contains the number of kinds of the toys n (0 ≤ n ≤ 1000).
//    Each of the next n lines contains 2 numbers: the number of toys a (0 ≤ a ≤ 1000)
//    of the next kind and their price b (0 < b ≤ 10000) in grn.
//    Output
//    Print the number of toys with cost less than 50 grn.

    public static void main(String[] args) {
        int[][] toys = {
                {12, 76},
                {7, 39},
                {5, 20},
                {11, 105}
        };
        int quantity = 0;

        for (int i = 0; i < 4; i++) {
            if (toys[i][1] < 50) {
                quantity += toys[i][0];
            }
        }
        System.out.println(quantity);
    }
}
