package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */

    @Override
    public int find(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
           int mid = (lo + hi) / 2;
           if (target < arr[mid])
                hi = mid - 1;
         else if (target > arr[mid])
             lo = mid + 1;    
            else
                return mid;
     }
       return -1;

    }

}
