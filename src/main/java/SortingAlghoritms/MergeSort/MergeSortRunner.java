package SortingAlghoritms.MergeSort;

import java.util.Arrays;

public class MergeSortRunner
{
    public static void main(String[] args)
    {
        int[] arr = {1,4,5,2,24564,21,7,8,31, 24, 21};

        System.out.println("array before mergesort" + Arrays.toString(arr));
        MergeSort.mergeSort(arr, 0, arr.length -1);
        System.out.println("array after mergesort" + Arrays.toString(arr));
    }
}
