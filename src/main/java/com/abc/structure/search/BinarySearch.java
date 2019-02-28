package com.abc.structure.search;

public class BinarySearch {


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        int value = 1;

        int left = 0;
        int right = array.length-1;
        int index = binarySearch(array, value, left, right);
        System.out.println("index: " + index);

        // method 2
        int index2 = binarySearch2(array, value, left, right);
        System.out.println("index2: " + index2);

    }

    private static int binarySearch2(int[] array, int value, int left, int right) {
        while (left <= right) {
            int middle = (right + left) / 2;
            if (array[middle] < value) {
                left = middle + 1;
            } else if (array[middle] > value) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int value, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (right + left) / 2;
        System.out.println("middleValue: " + array[middle]);
        if (array[middle] < value) {
            return binarySearch(array, value, middle+1, right);
        } else if (array[middle] > value) {
            return binarySearch(array, value, left, middle - 1);
        } else {
            return middle;
        }
    }
}
