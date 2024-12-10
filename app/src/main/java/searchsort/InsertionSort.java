package searchsort;

public class InsertionSort {
    /**
     * Sort the array arr using insertion sort algorithm.
     */
    public static void sort(int[] arr) {
        int N = arr.length;
         for (int i = 1; i < N; i++){
            for (int j = i; j > 0; j--){
                if (arr[j-1] > arr[j]){
                    exch(arr, j, j-1);  
                } else {
                    break;
                }
            }
        }
    }
}
