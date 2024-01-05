package Recursion;
public class isSorted {

    public static boolean isIt(int arr[],int i)
    {
        if(arr.length-1 == i)
            return true;
        
        return arr[i]<=arr[i+1] && isIt(arr, i+1);
    }
}
