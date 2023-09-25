import IntroToArray.BuyandSellStocks;

public class AMainClass {
    public static void main(String[] args) {
        // int arr[] = {2,4,6,8,10};
        // int arr2[] = {1,-2,6,-1,3};
        // int arr3[] = {4,2,0,6,3,2,5};
        // int arr4[] = {6,9,9};
        int arr5[] = {7,1,5,3,6,4};
        System.out.println("\n--------------My Array--------------");
        for (int i : arr5) {
            System.out.print(i+" ");
        }
        System.out.println("\n----------------------------");
        //--------------Binary Search--------------------
        // int findElem = IntroToArray.Array5Bin.search(arr, 10);
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

        //--------------HW. Subarray Sum--------------
        // IntroToArray.Array8HomeWork.findSum(arr2);

        //--------------SubArray Sum --------------
        // IntroToArray.Array9.findMaxSubArrSum(arr);
        // IntroToArray.Array9.findMaxSubArrSum(arr2);

        //--------------SubArray Sum More Optimal usign Prefix Array--------------
        // IntroToArray.Array10.findSumSubArr(arr);
        // IntroToArray.Array10.findSumSubArr(arr2);

        //--------------SubArray Sum Using KadansAlgo Most Optimal--------------
        // IntroToArray.Array11Kadan.findSum(arr);
        // IntroToArray.Array11Kadan.findSum(arr2);


        //--------------RainWater Trapped Problem--------------
        // IntroToArray.TrapRainWater.findTrapWaterbyMeraMethod(arr);
        // IntroToArray.TrapRainWater.findTrapWaterbyMeraMethod(arr3);
        // IntroToArray.TrapRainWater.findTrapWaterbyMeraMethod(arr4);
        System.out.println();
        // System.out.println(IntroToArray.TrapRainWater.findTrapWaterbyDidiMethod(arr3));
        // System.out.println(IntroToArray.TrapRainWater.findTrapWaterbyDidiMethod(arr4));

        IntroToArray.BuyandSellStocks.meraMethod(arr5);
        
    }
}
