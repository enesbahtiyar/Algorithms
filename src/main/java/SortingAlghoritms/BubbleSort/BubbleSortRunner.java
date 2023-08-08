package SortingAlghoritms.BubbleSort;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {

        int arr[] = { 3, 1, 2};

        System.out.println("Array Before BubbleSort: "+ Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println("Array After BubbleSort: "+ Arrays.toString(arr));

    }
}
