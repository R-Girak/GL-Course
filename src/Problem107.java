/**
 * Created by roman.girak on 08/02/2018.
 */
public class Problem107 {
//    Compact discs
//    https://www.e-olymp.com/en/problems/107
//
//    Blank compact discs are on sale in packages of three kinds.
//    A package with 100 disсs costs 100 UAH, one with 20 discs costs 30 UAH,
//    and one disс costs 2 UAH. What minimal sum of money should you pay to buy n such disсs?
//    Input
//    The natural number n (n ≤ 1000).
//    Output
//    Print the minimal sum to buy n disсs.

    public static void main(String[] args) {

        int n;  // Number of CDs
        int hundreds;  // Number of hundreds
        int twenties;  // Number of twenties
        int sum; // Total sum

        n = 225;

        if (n <= 0) {
            System.out.println("Incorrect value - 0 or less");
        }

        else {
// Count hundreds
            if (n >= 100) {
                hundreds = n/100;
                n = n%100;
            }
            else {
                hundreds = 0;
            }
// Count twenties
            if (n >= 10) {
                twenties = n/20;
                n = n%20;
            }
            else {
                twenties = 0;
            }
// Count sum
            sum = hundreds*100 + twenties*30 + n*2;
            System.out.println(sum);
        }
    }
}
