/**
 * Created by roman.girak on 12/02/2018.
 */
public class Problem904 {
//    Increase by 2
//    https://www.e-olymp.com/en/problems/904
//
//    The one-dimensional array of integers is given. Increase by 2 each its non-negative element.
//    Input
//    In the first line the number of elements n (n ≤ 100) in array is given.
//    In the second line the elements of array are given, each of them does not exceed 100 by absolute value.
//    Output
//    Print n numbers in one line - the new elements of array, in the order they were given.

    public static void main(String[] args) {
        int [] arr = {15, 66, -93, -16, 18, 0} ;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] >= 0) {
                arr[i] += 2;
            }
            System.out.print(arr[i] + ", ");
        }
    }
}
