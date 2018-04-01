package Lesson08;

import java.util.Arrays;

/**
 * Created by roman.girak on 22/02/2018.
 */
public class Main {

    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        int[] result = arrayProcessing.uniqueElements(new int[]{1, 2, 4, 2, 5});
        System.out.println(Arrays.toString(result));

        int[] result2 = arrayProcessing.uniqueElements(new int[]{1, 2, 4, 5}, new int[]{1, 3, 7, 5});
        System.out.println(Arrays.toString(result2));
    }
}