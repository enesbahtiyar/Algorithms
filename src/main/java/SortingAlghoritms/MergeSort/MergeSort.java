package SortingAlghoritms.MergeSort;

public class MergeSort
{
    public static void merge(int arr[], int left, int middle, int right){

        int low = middle - left +1; // Size of the left subarray
        int high = right - middle; // Size of the right subarray

        // Creating the right and left subarrays
        int L[] = new int[low];
        int R[] = new int[high];

        // Instead of creating those values in a for loop, we can declare them here
        int i = 0, j = 0;

        // Copy the elements into the left subarray
        for (i=0; i<low; i++){
            L[i] = arr[left+i];
        }

        // Copy the elements into the right subarray
        for (j=0; j<high; j++){
            R[j] = arr[middle + 1 + j];
        }

        // Start index for sorting
        int k = left;

        // Resetting loop variables
        i = 0;
        j = 0;

        // While we stay inside the boundaries of our array
        while (i < low && j< high){

            // If we need to swap anything while merging, we'll do it here.
            // Check if the right arrays element is bigger than the left ones
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;

        }

        // Merging the left sides remaining elements
        while (i < low){
            arr[k] = L[i];
            i++;
            k++;
        }

        // Merging the right sides remaining elements
        while (j<high){
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    // Helper function for recursive
    public static void mergeSort(int arr[], int left, int right){

        int middle;

        // Make sorting only if the left index is less than the right one
        if (left < right){

            middle = (left+right)/2;

            // Left SubArray
            mergeSort(arr, left, middle);

            // Right SubArray
            mergeSort(arr, middle+1, right);

            merge(arr, left, middle, right);

        }

    }
}
