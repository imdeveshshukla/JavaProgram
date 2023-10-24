package IntroToArray;

import java.util.Arrays;

/**
 * Array5Bin
 */
public class Array5Bin {

    public static int search(int a[],int key){
        int start = 0;
        int end = (a.length-1);
        while (start<=end) {
            int mid = (start+end)/2;
            if(a[mid] == key){
                return mid;
            }
            else if(key<a[mid])
            {
                end = mid-1;
            }
            else if(key>a[mid]){
                start = mid+1;
            }
            System.out.println(Arrays.toString(a));
        }
        return -1;
    }
}