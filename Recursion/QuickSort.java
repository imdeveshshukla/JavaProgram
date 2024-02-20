package Recursion;

import java.util.Arrays;

public class QuickSort{
    public static void find(int s,int e,int nums[])
    {
        if(s>=e){
            return;
        }
        int mid = s+(e-s)/2;  //pivot element
        int pivot = nums[mid];
        int start = s;
        int end = e;
        while (start<=end) {
            while(nums[start]<pivot)
            {
                start++;
            }
            while (nums[end]>pivot) {
                end--;
            }
            if(start<=end)
            {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(nums));
        }
        
        find(s,end,nums);
        find(start,e,nums);
    }

}