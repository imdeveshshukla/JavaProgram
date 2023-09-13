package IntroToArray;

public class Array3 {
    public static int linearSearch(int a[],int k){
        for(int i = 0; i < a.length; i++)
        {
            if(k == a[i])
                return i; 
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,10,6,7,8,9};
        int key = 10;
        System.out.print(linearSearch(arr, key));
    }
}
