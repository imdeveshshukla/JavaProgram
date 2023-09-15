package IntroToArray;

public class Array4 {
    public static int getLargest(int a[]){
        int largestVal = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            if(largestVal<a[i])
                largestVal = a[i];
        }
        return largestVal;
    }
    public static int getSmallest(int a[]){
        int largestVal = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            if(largestVal>a[i])
                largestVal = a[i];
        }
        return largestVal;
    }
    
}
