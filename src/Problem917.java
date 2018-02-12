/**
 * Created by roman.girak on 12/02/2018.
 */
public class Problem917 {
//    Twice the minimum
//    https://www.e-olymp.com/en/problems/917
//
//    The array of real numbers is given. Calculate the twice value of the minimum element in array.
//    Input
//    First line contains the number n (n ≤ 100) of elements in array.
//    Second line contains n real numbers - the elements of array. Each value does not exceed 100 by absolute value.
//    Output
//    Print the twice value of the minimum element in array with 2 decimal digits.

    public static void main(String[] args) {
        double [] arr = {15.0, 66.6, -9.3, -1.6, 1.8, 0.0} ;
        double min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The doubled minimal element's value is: " + min*2);

    }
}
