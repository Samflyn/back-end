package org.example.sorting;

import java.util.Arrays;

// we have a pivot point and compare it with every item
// if the item is less than pivot then we exchange with the first item which is greater
// we then swap the pivot with last item that is less than, i.e we have the final position
// we run quick sort on just the left section of the pivot
// we run this recursively
// we do the same for the right section of the initial pivot and do the same again
public class QuickSort {
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);

        return swapIndex;
    }

    private static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, right);
        }
    }

    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    public static void main(String[] args) {

        int[] myArray = {4, 6, 1, 7, 3, 2, 5};

        quickSort(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}
