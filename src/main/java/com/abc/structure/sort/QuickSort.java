package com.abc.structure.sort;

import java.util.Arrays;

/**
 * Created by liujinwen on 2019-02-28
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 8, 6, 2, 5, 9};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = getMiddle(array, low, high);

            quickSort(array, low, middle);
            quickSort(array, middle+1, high);
        }
    }

    private static int getMiddle(int[] array, int low, int high) {
        int temp = array[low];
        while (low < high) {
            while (low < high && array[high] > temp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] < temp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = temp;
        return low;
    }
}
