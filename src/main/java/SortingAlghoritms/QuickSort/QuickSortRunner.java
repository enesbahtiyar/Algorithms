package SortingAlghoritms.QuickSort;

import SortingAlghoritms.InsertionSort.InsertionSort;

import java.util.Arrays;

public class QuickSortRunner
{
    public static void main(String[] args) {
        int arr[] = {3,5,4,12,17,15,17,16,19,21,27,32,33,57,43,56};

        System.out.println("array before quicksort:" + Arrays.toString(arr));
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println("array after quicksort: " + Arrays.toString(arr));
    }
}
