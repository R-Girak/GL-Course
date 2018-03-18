package Lesson05;

/**
 * Created by roman.girak on 12/02/2018.
 */
public class Problem907 {
//    The first is not greater for 2,5
//    https://www.e-olymp.com/en/problems/907
//
//    Array of real numbers is given. Find the first element in array which value does not exceed 2.5.
//    Input
//    In the first line the number of elements in array n (0 < n ≤ 100) is given. Next line describes n real numbers.
//    Output
//    Print in one line the index of the first specified element in array and its value with 2 decimal digits.
//    In the case of absence the specified element print "Not Found" (without quotes).
    public static void main(String[] args) {
        double [] arr = {15.0, 66.6, -9.3, -1.6, 1.8, 0.0} ;
        int sRes = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2.5) {
                sRes = i;
                break;
            }
        }
        if (sRes == -1) {
            System.out.println("\"Not Found\"");
        }
        else {
            System.out.println("It's element no. " + (sRes + 1) + ", which is equal to " + arr[sRes]);
        }
    }
}
