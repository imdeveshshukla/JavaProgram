package IntroToArray.Leetcode;
import java.util.Arrays;

import IntroToArray.Swap;
/*Leetcode hard PRoblem
 * 41. First Missing Positive Number
 * Given an unsorted integer array nums, return the smallest missing positive integer.

  *  You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 */
public class FirstMissingNum {
    public static int find(int[] a){
        int i = 0;
        //APplied Cyclic sort

        while (i<a.length) {
            int correct = a[i]-1;
            if(correct<(a.length) && correct>=0)
                if (a[correct]!=a[i]) 
                    Swap.number(a,correct,i);            
                else
                    i++;
            else 
                i++;
        }

        for(int j = 0; j < a.length; j++)
        {
            if(j+1 != a[j])
                return (j+1);
        }
        System.out.println(Arrays.toString(a));
        return -1;
    }
}
