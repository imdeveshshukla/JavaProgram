package IntroToArray;

public class Array6 {
    public static void reverseArr(int a[]){
        int k = a.length-1;
        for(int i = 0; i < (a.length)/2; i++){
            int temp = a[i];
            a[i] = a[k];
            a[k]=temp;
            k--;
        }
    }
}
