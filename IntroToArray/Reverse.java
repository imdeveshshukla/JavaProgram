package IntroToArray;
public class Reverse{
    public static void arr(int[] a)
    {
        int l = a.length - 1;
        for(int i=0;i<(a.length)/2;i++){
            swap(a, i, l);
            l--;
        }   
    } 
    public static void swap(int[] a,int i,int j)
    {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}