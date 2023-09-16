public class AMainClass {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,15};
        int k = 10;

        //--------------Binary Search--------------------
        // int findElem = IntroToArray.Array5Bin.search(arr, k);
        // System.out.println(k+"'s index At = "+findElem);

        //--------------Reverse--------------
        // IntroToArray.Array6.reverseArr(arr);
        // for(int i = 0; i < arr.length; i++)
        //     System.out.print(arr[i]+" ");

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
