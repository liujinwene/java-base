package com.abc.structure.sort;

import java.util.Arrays;

/**
 * Created by liujinwen on 2019-02-28
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 8, 6, 2, 5, 9};
        insertSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            for (; j > 0 && temp < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
    }
}
