package Recursion;
import java.util.Arrays;
public class MergeSort {
    public static int[] start(int a[]){
        if(a.length == 1)
            return a;
        
        int mid = a.length / 2;
        
        int left[] = start(Arrays.copyOfRange(a,0,mid));
        int right[] = start(Arrays.copyOfRange(a, mid, a.length));

        return merge(left,right);
    }
    private static int[] merge(int a[],int b[]){
        int ans[] = new int[a.length + b.length];
        int i =0 ;
        int j=0;
        int k=0;

        while (i<a.length && j<b.length) {
            if(a[i]<b[j]){
                ans[k] = a[i];
                i++;
            }
            else
            {
                ans[k] = b[j];
                j++;
            }
            k++;
        }
        while (i<a.length) {
            ans[k] = a[i];
            i++;
            k++;
        }
        while (j<b.length) {
            ans[k] = b[j];
            j++;
            k++;
        }
        return ans;
    }
}
