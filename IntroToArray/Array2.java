package IntroToArray;

public class Array2 {
    public static void update(int a[]){
        for(int i = 0; i < a.length; i++)
        {
            a[i] = a[i]+1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        update(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }               
}
