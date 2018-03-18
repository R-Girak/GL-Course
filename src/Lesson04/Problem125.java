package Lesson04;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem125 {
//        Olympiad
//        https://www.e-olymp.com/en/problems/125
//
//        The Olympiad started at h1 hours m1 minutes s1 seconds, and finished at the same calendar day
//        at h2 hours m2 minutes s2 seconds. What is the duration (hour min sec) of Olympiad?
//        Input
//        The first line contains the starting time, the second line contains the finishing time
//        in format hour min sec (0 ≤ h1 ≤ h2 ≤ 23, 0 ≤ m1, m2 ≤ 59, 0 ≤ s1, s2 ≤ 59.
//        Output
//        Print the duration of the Olympiad in format hour min sec.

    public static void main(String[] args) {
        int h1 = 12, m1 = 2, s1 = 2; // Start time
        int h2 = 6, m2 = 8, s2 = 1; // End time

        int start = s1 + m1*60 + h1*3600;
        int end = s2 + m2*60 + h2*3600;

        if (end <= start) {
            System.out.println("Incorrect data entered: end time must be greater than start time");
        }
        else {
            int duration = end - start;
            int h = duration/3600;
            int m = (duration - h*3600)/60;
            int s = (duration - h*3600) - m*60;
            System.out.println("The duration is: " + h + " h " + s + " m " + s + " s ");
        }
    }
}
