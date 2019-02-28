package com.abc.structure.sort;

import java.util.Arrays;

/**
 * Created by liujinwen on 2019-02-28
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 8, 6, 2, 5, 9};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            sort(array, low, middle);
            sort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    private static void merge(int[] array, int low, int middle, int high) {
        int[] tempArray = new int[high - low + 1];
        int i = low;
        int j = middle+1;
        int k = 0;

        // 左小于右
        while (i <= middle && j <= high) {
            if (array[i] < array[j]) {
                tempArray[k++] = array[i++];
            } else {
                tempArray[k++] = array[j++];
            }
        }
        // 左剩余
        while (i <= middle) {
            tempArray[k++] = array[i++];
        }
        // 右剩余
        while (j <= high) {
            tempArray[k++] = array[j++];
        }
        // 填充到数组中
        for (int k2 = 0; k2 < tempArray.length; k2++) {
            array[k2 + low] = tempArray[k2];
        }
    }
}
