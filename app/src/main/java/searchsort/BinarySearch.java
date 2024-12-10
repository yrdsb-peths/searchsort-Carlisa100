package searchsort;

public class BinarySearch extends Search {
    

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
