// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import LinkedList.MeraLinkedList;

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
        // IntroToArray.Array11Kadan.findSum(new int[]{-1});
        // IntroToArray.Array11Kadan.findSum(arr2);


        //--------------RainWater Trapped Problem--------------
        // IntroToArray.TrapRainWater.findTrapWaterbyMeraMethod(arr);
        // IntroToArray.TrapRainWater.findTrapWaterbyMeraMethod(arr3);
        // IntroToArray.TrapRainWater.findTrapWaterbyMeraMethod(arr4);
        System.out.println();
        // System.out.println(IntroToArray.TrapRainWater.findTrapWaterbyDidiMethod(arr3));
        // System.out.println(IntroToArray.TrapRainWater.findTrapWaterbyDidiMethod(arr4));

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
        // int d = IntroToArray.Leetcode.FirstMissingNum.find(new int[]{7,8,1,2,9,10,12});
        // System.out.println(d);


        //--------------------STRING--------------------
        //pALINDROME NUMBER
        // IntroToString.CheckPalindrome.isIt("abba");

        //--------------------Recursion--------------------
        // Recursion.HelloWorld.say(5);

        // System.out.println(Recursion.Factorial.findMy(4));
        // System.out.println(Recursion.Factorial.findActual(4));

        //Sumof Digit using recursion
        // System.out.println(Recursion.sumofDigit.find(1342));
        
        //Reverse using recursion
        // System.out.println(Recursion.findReverseofNumber.find2(1442));
        // System.out.print(" "+Recursion.findReverseofNumber.getrev());

        //Count numebr of Zero 
        // System.out.println(Recursion.countZero.start(010101));

        //FInd if array is sorted or not
        
        // boolean ans = Recursion.isSorted.isIt(new int[]{1,2,2,75,100},0);
        // System.out.print(ans);

        //Linear Search
        // System.out.println(Recursion.linearSearch.find(new int[]{1,2,2,75,100},0, 2, new ArrayList<>()));
        //8/01/24
        // int k = '1' - '0';
        // System.out.println(k);
        //LinearSearch2
        // System.out.println(Recursion.linearSearch.find2(new int[]{1,2,2,75,100},0, 100));
        //Fibonacci Number
        // System.out.println(Recursion.Fibonacci.find(100));

        //--------------------Fibonacci using formula--------------------

        // double a = Math.pow(((1+Math.sqrt(5))/2), 100); //Using recurrence relation
        // double b = Math.pow(((1-Math.sqrt(5))/2), 50);
        // double ans =1/Math.sqrt(5)*(a);  
        // System.out.println(" 50th fibo num = "+ ans);
        
        //Binary Search using recursion
        // System.out.println(Recursion.BinSearch.find(new int[]{1,2,3,4,5}, 5, 0, 4));

        //Search in Rotated Array
        // System.out.println(LeetCode.SearchRotatedArr.find(new int[]{5,6,7,8,9,1,2,3}, 3));
        //Search in Rotated Array using recursion
        // System.out.println(Recursion.SearchRotatedArr.find(new int[]{5,6,7,8,9,1,2,3}, 3, 0, 7));

        //PATTERN PRINTING USING RECURSION
        //* * * *
        //* * *
        //* *
        //*
        // Recursion.Pattrn1.printPat(4, 0);
        //BUBBLE SORT USIGN RECURSION
        // int a[] = {4,3,8,1,0,1,1};
        // Recursion.BubbleSort.karo(a, 4, 0);
        //31 dec
        //SELECTION SORT USING RECURSION
        // Recursion.SelectionSort.karo(a, 6, 0, 0);

        //MERGE SORTING USING RECURSION
        // a = Recursion.MergeSort.start(a);
        // System.out.println(Arrays.toString(a));

        //--------------------Quick Sort Using Recursion--------------------

        int arr[]= {5,3,2,4,1};
        Recursion.QuickSort.find(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        //--------------------Bit manipulation--------------------

        //Magic Number
        // BitManipultation.MagicNum.find(10);
        //Count DIgit without loop 
        // BitManipultation.CountiDigit.search(6,2);

        //--------------------Single Linked List--------------------
        // MeraLinkedList test = new MeraLinkedList(10);
        // MeraLinkedList.insert(test, 10);
        // MeraLinkedList.insert(test, 100);
        // MeraLinkedList.insert(test, 1000);
        // MeraLinkedList.printL(test);



    }
}
//03-10-2023
//06-10-2023
//09-10-2023
//11-10-2023
//16-10-2023
//05-11-23
// 01/03/24
//05/03/24