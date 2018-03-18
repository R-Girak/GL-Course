package Lesson04;

/**
 * Created by roman.girak on 08/02/2018.
 */
public class Problem923 {
//    Season
//    https://www.e-olymp.com/en/problems/923
//
//    Determine the season name by the month number using the compound conditions.
//    Input
//    The number of the month.
//    Output
//    For spring months print Spring, for summer - Summer, for autumn - Autumn and for winter - Winter.

    public static void main(String[] args) {
        int month;
        month = 6;

        if (month >= 3 & month <= 5) {
            System.out.println("Spring");
        }
        else if (month >= 6 & month <= 8) {
            System.out.println("Summer");
        }
        else if (month >= 9 & month <= 11) {
            System.out.println("Autumn");
        }
        else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }
        else {
            System.out.println("No such month exists");
        }

    }
}
