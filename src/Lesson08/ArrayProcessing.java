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

    // todo...
    public int[] uniqueElements(int[] arr1, int[] arr2) {
        int[] sortedArr = new int[arr1.length];
        sortedArr = Arrays.copyOf(arr1, arr1.length);
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
        for (int i = arr1.length - 1; i >= 0; i--) {
            boolean isUnique = true;
            for (int j = i - 1; j >= 0; j--) {
                if (arr1[i] == arr1[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                resultArr[resultArrayIndex] = arr1[i];
                resultArrayIndex--;
            }
        }

        int[] resultArr2 = new int[resultArr.length];
        resultArrayIndex = resultArr.length - 1;
        for (int i = 0; i < resultArr.length; i++) {
            boolean isIn2 = false;
            for (int j = 0; j < arr2.length; j++) {
                if (resultArr[i] == arr2[j]) isIn2 = true;
            }
            if (isIn2) {
                resultArr2[i] = resultArr2[i];
                resultArrayIndex--;
            }
        }
        return resultArr2;
    }
}
