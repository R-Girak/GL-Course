/**
 * Created by roman.girak on 12/02/2018.
 */
public class Problem908 {
//    Those that are divided into 6
//    https://www.e-olymp.com/en/problems/908
//
//    For N integers define the sum and quantity of positive numbers which share on 6 without the rest.
//    Input
//    In the first line the quantity of numbers N (0 < N ≤ 100) is set,
//    next line through a blank is set the numbers which value on the module do not exceed 10000.
//    Output
//    In a unique line deduce at first quantity of the specified numbers and through a blank their sum.

    public static void main(String[] args) {
        int stop = 10;
        int sum = 0, number = 0;

        for (int i = 0; i < stop; i++) {
            if (i%6 == 0) {
                number++;
                sum += i;
            }
        }
        System.out.println("The number of values is " + number + " and their total sum is " + sum);
    }
}
