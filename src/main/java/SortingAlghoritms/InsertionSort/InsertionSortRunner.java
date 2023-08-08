package SortingAlghoritms.InsertionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSortRunner
{
    public static void main(String[] args)
    {
        int[] arr1 = {7,4,5,9,8,2,1};

        System.out.println("array before insertionsort:" + Arrays.toString(arr1));
        InsertionSort.insertionSort(arr1);
        System.out.println("array after insertionsort: " + Arrays.toString(arr1));
    }
}
