// import java.lang.reflect.Array;
import java.util.Arrays;

import IntroToArray.*;
public class AMainClass {
    public static void main(String[] args) throws InterruptedException {
        // int arr[] = {2,4,6,8,10};
        // int arr2[] = {1,-2,6,-1,3};
        // int arr3[] = {4,2,0,6,3,2,5};
        // int arr4[] = {6,9,9};
        // int arr5[] = {7,1,5,3,6};
        int arr6[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        // System.out.println("\n--------------My Array--------------");
        // System.out.println(Arrays.toString(arr5));
        // System.out.println("\n----------------------------");
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
//03-10-2023
//06-10-2023
//09-10-2023
//11-10-2023
//16-10-2023
//05-11-23
        //--------------Buy and Sell Stocks Problem--------------
        // IntroToArray.BuyandSellStocks.meraMethod(arr5);

        //--------------Reverse an array--------------
        // IntroToArray.Reverse.arr(arr5);
        // System.out.println(Arrays.toString(arr5));
        
        //--------------Search in 2d Array Using Binary Search--------------
        // System.out.println(Arrays.toString(IntroToArray.Arr2DBinSearch.findElem(arr6,96)));


        //Bubble sorting 
        // System.gc();
        // IntroToArray.BubbleSort.meraMethod(new int[]{1,2,3,4,5});
        // IntroToArray.BubbleSort.sort(new int[]{1,2,3,4,5});

        //Selection Sorting
        // IntroToArray.SelectionSort.find(new int[]{5,5,5,1,2,3,2});

        //Insertion Sorting
        // IntroToArray.InsertionSort.sort(new int[]{5,5,5,1,2,3,2});

        //Cycle Sorting
        // IntroToArray.CycleSort.sortKarDo(new int[]{3,5,2,1,4});

        //LeetCOde Easy Missing NUmber
        // IntroToArray.Assignments.MissingNumber.find(new int[]{2,5,9,6,9,3,8,9,7,1});

        //LeetCode Medium find the duplicate number
        // IntroToArray.Assignments.leetcode_287.findDuplicate(new int[]{2,5,9,6,9,3,8,9,7,1});

        //LeetCode Hard 41.FindMissingPositiveNumber
        IntroToArray.Leetcode.FirstMissingNum.find(new int[]{7,8,9,10,12});

    }
}
