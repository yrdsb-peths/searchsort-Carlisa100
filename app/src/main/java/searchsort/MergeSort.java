package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);
    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void sort(int[] arr, int[] aux, int left, int right) {
        if (left >= right) return;
        int mid = (left + right)/ 2;         //index of middle element
        sort(arr, aux, left, mid);      //Sort left side of array
        sort(arr, aux, mid + 1, right);  //Sort right side of array
        merge(arr, aux, left, mid, right); 
    }


    private void merge(int[] a, int[] aux, int lo, int mid, int hi){
        for(int k = lo; k <= hi; k++)    // copy
            aux[k] = a[k];
        int i = lo;                      // left side index
        int j = mid + 1;                 // right side index
        for (int k = lo; k <= hi; k++) { // merge
            if (i > mid)                 // left is exhausted
                a[k] = aux[j];
                j++;
            if (j > hi)             // right is exhausted
                a[k] = aux[i];
                i++;
            if (aux[j] < aux[i])    // right element smaller than left
                a[k] = aux[j];
                j++;
            else                        // left element smaller than right
                a[k] = aux[i];
                i++;
        }
    }    
   
}
