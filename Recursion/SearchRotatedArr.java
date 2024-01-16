package Recursion;

public class SearchRotatedArr {
    public static int find(int[] nums,int t,int s,int e){
        if(s>e)
            return -1;
        int m = (s+e)/2;
        if(nums[m] == t)
            return m;
        
        if(nums[s]<=nums[m])
        {
            if(nums[s]<=t && nums[m]>=t)
                return find(nums, t, s, m-1);
            else
                return find(nums, t, m+1, e);
        }
        else
        {
            if(nums[m]<=t && nums[e]>=t)
                return find(nums, t, m+1, e);
            else
                return find(nums, t, s, m-1);
        }
    }
}
