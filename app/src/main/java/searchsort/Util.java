package searchsort;

import java.util.Random;

public class Util {

   
    public static int[] shuffle(int[] arr, Long seed) {
        
        Random random = (seed != null) ? new Random(seed) : new Random();

        
        for (int i = arr.length - 1; i > 0; i--) {
            
            int j = random.nextInt(i + 1);
            
            exch(arr, i, j);
        }
        return arr;
    }

    public static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    public static int[] generateRandomArray(int n, Long seed) {
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        
        return shuffle(arr, seed);
    }

   
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;  
            }
        }
        return true;  
    }

}

