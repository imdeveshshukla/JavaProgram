// https://leetcode.com/problems/search-in-rotated-sorted-array/
package LeetCode;
//For Recursion See in recursion folder
public class SearchRotatedArr {
    public static int find(int num[],int t){
        int s = 0,e = num.length - 1;
        System.out.println("In the Function "+s+" "+e);
        while (s<=e) {
            System.out.println("In the Loop "+s+" "+e);
            int mid = (s + e)/2;
            if(num[mid] == t)
                return mid;
            
            if(num[s]<=num[mid]){
                if(num[s]<=t && num[mid]>=t)
                    e = mid-1;
                else
                    s = mid+1;
            }
            else{
                if(num[mid]<=t && num[e] >= t)
                    s = mid+1;
                else
                    e = mid - 1;
            }
        }
        return -1;
    }     
}
