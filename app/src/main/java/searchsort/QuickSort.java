package searchsort;

public class QuickSort extends Sort {
    /**
     * Sort the array arr using quick sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /*
     * Sort the subarray arr[low..high] using quick sort algorithm.
     */
    private void quickSort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int p = partition(a, lo, hi); 
        quickSort(a, lo, p - 1); 
        quickSort(a, p + 1, hi); 
 
   
    }

    /*
     * Partition the subarray arr[low..high] using the last element as pivot.
     * Return the index of the pivot element after partition.
     */
    private int partition(int[] a, int lo, int hi) {
        int i = lo; 
        int j = hi + 1;
        while (true) {
            while (a[++i] < a[lo])  // Find item on left to swap  
                if (i == hi) break; 
            while (a[--j] > a[lo]) 
                if (j == lo) break;
            
            if (i >= j) break;  // Check if pointers cross 
            exch(a, i, j);  // Swap
        } 
        exch(a, lo, j);  // Swap partitioning element  
        return j;  // Return index of item now know to be in place
    }

    private void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
