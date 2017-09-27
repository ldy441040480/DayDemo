package com.example.quick;

/**
 * Created by lidongyang on 2017/9/26.
 */

public class QuickSort {

    public static final int[] ARRAY = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    public static int[] sort(int[] array) {
        if (array != null && array.length > 0) {
            sort(array, 0, array.length - 1);
        }
        return array;
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int index = partition(array, low, high);
            sort(array, low, index - 1);
            sort(array, index + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int key = array[low];

        while (high > low) {

            while (array[high] >= key && high > low) {
                high--;
            }
            array[low] = array[high];

            while (array[low] <= key && low < high) {
                low++;
            }
            array[high] = array[low];
        }

        array[high] = key;

        return high;
    }

}
