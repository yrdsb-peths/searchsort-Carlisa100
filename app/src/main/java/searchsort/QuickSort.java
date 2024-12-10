package searchsort;

public class QuickSort extends Sort {
    
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    
    private void quickSort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int p = partition(a, lo, hi); 
        quickSort(a, lo, p - 1); 
        quickSort(a, p + 1, hi); 
 
   
    }

   
    private int partition(int[] a, int lo, int hi) {
        int i = lo; 
        int j = hi + 1;
        while (true) {
            while (a[++i] < a[lo])   
                if (i == hi) break; 
            while (a[--j] > a[lo]) 
                if (j == lo) break;
            
            if (i >= j) break;  
            exch(a, i, j);  
        } 
        exch(a, lo, j);    
        return j; 
    }

    private void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
