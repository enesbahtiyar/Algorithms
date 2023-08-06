package SortingAlghoritms.selectionSort;

public class SelectionSortRunner
{
    public static void main(String[] args)
    {
        int[] arr = {7,4,5,9,8,2,1};
        System.out.println("----- before selection sort ******");
        for (int a: arr)
        {
            System.out.println(a);
        }

        SelectionSort.selectionSort(arr);

        System.out.println("----- after selection sort ******");
        for (int a: arr)
        {
            System.out.println(a);
        }

    }
}
