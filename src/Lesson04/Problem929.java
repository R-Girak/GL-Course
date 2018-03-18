package Lesson04;

/**
 * Created by Gerka on 18-Feb-18.
 */
public class Problem929 {
//    Parallelogram
//    https://www.e-olymp.com/en/problems/929
//
//    4 numbers a, b, c, d, defining lengths of pieces are set.
//    Define, is it possible to form a parallelogram from these pieces.
//    Input
//    In a unique line set 4 numbers through a blank.
//    Output
//    Deduce in a unique line a word "YES" if it is possible to form a parallelogram or "NO" (without inverted commas) otherwise.

    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 4;
        int d = 6;
        boolean can = false;

        if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
            System.out.println("Incorrect data entered! Side can't be less than 0");
        }
        else {
            if (a == b && c == d) can = true;
            if (a == c && b == d) can = true;
            if (a == d && b == c) can = true;
        }
        if (can) System.out.println("Answer: Yes, You can");
        else System.out.println("Answer: No, You can't");
    }
}
