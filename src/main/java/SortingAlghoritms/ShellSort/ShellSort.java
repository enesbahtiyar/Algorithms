package SortingAlghoritms.ShellSort;

public class ShellSort
{
    public static void shellSort(int arr[])
    {
        int insert;
        int movingItemIndex;

        //gap: the divided element count in the arr
        //gap: cannot be equal to 0
        //gap /= device gap by 2 and assign it into the gap again
        for (int gap = arr.length/2; gap > 0; gap/=2)
        {
            for (int next = gap; next < arr.length; next++)
            {
                insert = arr[next];
                movingItemIndex = next;


                while (movingItemIndex >= gap && insert < arr[movingItemIndex - gap])
                {
                    arr[movingItemIndex] = arr[movingItemIndex - gap];

                    movingItemIndex -= gap;
                }

                arr[movingItemIndex] = insert;
            }
        }
    }
}
