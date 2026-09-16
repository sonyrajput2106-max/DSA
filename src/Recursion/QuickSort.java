package Recursion;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int s, int e) {

        // base case
        if (s >= e) {
            return;
        }

        // partitioning
        int pivotIndex = partition(arr, s, e);

        // left part recursion
        quickSort(arr, s, pivotIndex - 1);

        // right part recursion
        quickSort(arr, pivotIndex + 1, e);
    }

    static int partition(int[] arr, int s, int e) {

        // choose pivot element
        int pivotElement = arr[s];

        // count based approach for where to place the pivot
        int count = 0;
        for (int i = s; i <= e; i++) {
            if (arr[i] <= pivotElement) {
                count++;
            }
        }

        // place pivot on its correct position
        int correctPosition = s + count - 1;

        // swap pivot with element at correct position
        int temp = arr[correctPosition];
        arr[correctPosition] = arr[s];
        arr[s] = temp;

        // make sure elements on left are smaller
        // and elements on right are greater
        int i = s;
        int j = e;

        while (i < correctPosition && j > correctPosition) {

            // ignore smaller elements on left
            while (arr[i] < pivotElement) {
                i++;
            }

            // ignore greater elements on right
            while (arr[j] > pivotElement) {
                j--;
            }

            if (i < correctPosition && j > correctPosition) {

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return correctPosition;
    }

    static void main() {

        int[] arr = {4, 1, 3, 6, 9, 7};

        int s = 0;
        int e = arr.length - 1;

        quickSort(arr, s, e);

        System.out.println(Arrays.toString(arr));
    }
}