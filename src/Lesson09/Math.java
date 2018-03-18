package Lesson09;

/**
 * Created by roman.girak on 18/03/2018.
 */
public class Math {
    //    1. Create class Math with two static methods findMin and findMax.
    //    Methods will take array of int values as arguments and return minimum and maximum element value.
    //
    //    2. Add to class Math (from task 1) final static field PI = 3.14
    //    and static method areaOfCircle, which will take radius and calculate area of circle

    final static double PI = 3.14;

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double areaOfCircle(double r) {
        return PI*r*r;
    }
}

