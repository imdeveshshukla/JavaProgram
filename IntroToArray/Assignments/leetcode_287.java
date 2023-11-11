//Leetcode problem 287
/*
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.
 * Alternate SOlution
 * public int findDuplicate(int[] nums) {
        int[] find = new int[(nums.length+1)];
        for(int i = 0 ;i<nums.length;i++){
            find[nums[i]]++;
            if(find[nums[i]] > 1)
                return nums[i];
        }
        return -1;

    }
 */
package IntroToArray.Assignments;
// import IntroToArray;

import java.util.Arrays;

public class leetcode_287{
    public static int findDuplicate(int[] a){
        for (int i = 0; i < a.length;) {
            int correct = a[i]-1;
            if (a[correct]!= a[i]) 
                IntroToArray.Swap.number(a, correct, i);
            else 
                i++;
        }
        for (int i = 0; i < a.length; i++) {
            if (i!= a[i]-1);
                // return a[i];
        }
        System.out.println(Arrays.toString(a));
        return -1;
    }
}