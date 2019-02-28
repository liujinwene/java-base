package com.abc.structure.sort;

import java.util.Arrays;

/**
 * Created by liujinwen on 2019-02-28
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 8, 6, 2, 5, 9};
        shellSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i+=gap) {
                int temp = array[i];
                int j=i;
                for (; j > 0 && temp < array[j - gap]; j-=gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}
