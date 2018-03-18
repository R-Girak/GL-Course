package Lesson09;

import java.lang.*;
import java.lang.Math;

/**
 * Created by roman.girak on 18/03/2018.
 */
public class Calculator {
//    The value of 𝝅 can be calculated with series:
//    pi = 4-4/3 + 4/5 - 4/7 + 4/9 - 4/11 + …
//    Write class Calculator with public static method calcPi that takes as parameter an integer n,
//    and computes and returns the value of 𝝅 approximated to the first n term of the series

    public static double calcPi(int n) {
        if (n < 1) {
            System.out.println("Can't be ess then 1 !!!");
            return 0.0;
        } else {
            double pi = 0.0;
            for (int i = 0; i < n; i++) {
                pi = pi + ((java.lang.Math.pow(-1.0, i) * 4) / (i + Math.pow(2.0, i)));
            }
            return pi;
        }
    }
}
