package Recursion;

public class SelectionSort {
    public static void karo(int a[],int r,int c,int max){
        if(r<0)
            return;
        if(r>c){
            if(a[max]<a[c])
                karo(a, r, c+1, c);
            else
                karo(a, r, c+1, max);
        }
        else{
            int temp = a[max];
            a[max] = a[r];
            a[r] = temp;
            karo(a, r-1, 0, 0);
        }
    }
}
