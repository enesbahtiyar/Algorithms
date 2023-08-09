package SortingAlghoritms.ShellSort;

import SortingAlghoritms.QuickSort.QuickSort;

import java.util.Arrays;

public class ShellSortRunner
{
    public static void main(String[] args)
    {
        int arr[] = {3,5,4,12,17,15,17,16,19,21,27,32,33,57,43,56};

        System.out.println("array before shellsort:" + Arrays.toString(arr));
        ShellSort.shellSort(arr);
        System.out.println("array after shellsort: " + Arrays.toString(arr));
    }
}
