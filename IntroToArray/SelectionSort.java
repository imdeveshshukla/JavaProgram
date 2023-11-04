//In this we have to select max or min in whole array and arrange it according to there position
package IntroToArray;

import java.util.Arrays;

public class SelectionSort {
    public static void find(int[] a) {
        long start = System.nanoTime();
        for (int i = 0; i < a.length; i++) 
        {
            int max = Integer.MIN_VALUE,k=0;
            int last = a.length-1-i;
            for (int j = 0; j < (a.length-i); j++) 
            {
                if (max < a[j]){
                    max = a[j];
                    k = j;
                }
            }
            int temp = a[last];
            a[last] = max;
            a[k] = temp;
        }
        long finish = System.nanoTime();
        System.out.println(Arrays.toString(a));
        System.out.println((float)(finish-start));
    }
}
