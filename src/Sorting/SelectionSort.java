package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String [] args) {
        int [] arr = {10, 5, 6, 3, 1, 4, 2, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static int getMaxIndex(int [] arr, int start, int end) {
        for (int i = start; i <=end; i++) {
            if (arr[start] < arr[i]) {
                start = i;
            }
        }
        return start;
    }

    static void swap(int [] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
