public class AMainClass {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int k = 10;

        //--------------Binary Search--------------------
        // int findElem = IntroToArray.Array5Bin.search(arr, k);
        // System.out.println(k+"'s index At = "+findElem);

        //--------------Reverse--------------
        // IntroToArray.Array6.reverseArr(arr);
        // for(int i = 0; i < arr.length; i++)
        //     System.out.print(arr[i]+" ");

        //--------------Pairs--------------
        // System.out.println("Pairs :");
        // IntroToArray.Array7.makePair(arr);


        //--------------Print SubArray--------------
        // IntroToArray.Array8.printSubArray(arr);

        //--------------HW. Subarray--------------
        // IntroToArray.Array8HomeWork.findSum(arr);


        System.out.println("\n--------------My Array--------------");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
