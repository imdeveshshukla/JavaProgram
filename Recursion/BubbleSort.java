package Recursion;

public class BubbleSort {
    public static void karo(int a[],int r,int c){
        if(r<0)
            return;
        if((c+1)<a.length)
        {
            if(a[c]>a[c+1])
            {
                int temp = a[c];
                a[c] = a[c+1];
                a[c+1] = temp;
            }
            karo(a, r, c+1);
        }
        else
            karo(a, r-1, 0);
    }
}
