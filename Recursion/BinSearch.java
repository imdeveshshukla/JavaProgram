package Recursion;
/**
 * BinSearch
 */
public class BinSearch {
    public static int find(int a[],int k,int i,int j){

        int mid = i + (j-i)/2;
        if(i>j)             //when key is not present in array
            return -1;
        else if(a[mid] == k)
            return mid;
        else if(a[mid] < k)
            return find(a, k, mid+1, j);
        else                //if(a[mid] > k)
            return find(a,k,i,mid-1);
    }
}