package Lesson08;

import java.util.Arrays;

/**
 * Created by roman.girak on 22/02/2018.
 */

public class ArrayProcessing {

    public int[] uniqueElements(int[] arr) {
        int[] sortedArr = new int[arr.length];
        sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        int resultArrayLength = 1;
        for (int i = 0; i < sortedArr.length - 1; i++) {
            if (sortedArr[i] != sortedArr[i + 1]) {
                resultArrayLength++;
            }
        }
        int[] resultArr = new int[resultArrayLength];
        int resultArrayIndex = resultArr.length - 1;
        // it was wrong compare should be >= it was <=
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean isUnique = true;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                resultArr[resultArrayIndex] = arr[i];
                resultArrayIndex--;
            }
        }
        return resultArr;
    }
}
