package searchsort;

public class MergeSort extends Sort {
    
    @Override
    public void sort(int[] arr) {
        
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);
    }

   
    private void sort(int[] arr, int[] aux, int left, int right) {
        if (left >= right) return;
        int mid = (left + right)/ 2;         
        sort(arr, aux, left, mid);      
        sort(arr, aux, mid + 1, right);  
        merge(arr, aux, left, mid, right); 
    }


    private void merge(int[] a, int[] aux, int lo, int mid, int hi){
        for(int k = lo; k <= hi; k++)    
            aux[k] = a[k];
        int i = lo;                      
        int j = mid + 1;                 
        for (int k = lo; k <= hi; k++) { 
            if (i > mid){                
                a[k] = aux[j];
                j++;
            }else if (j > hi) {            
                a[k] = aux[i];
                i++;
            }else if (aux[j] < aux[i]){    
                a[k] = aux[j];
                j++;
            }else{                       
                a[k] = aux[i];
                i++;
            }
        }
    }    
   
}
