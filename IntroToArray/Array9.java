package IntroToArray;

/* Ques. Find Sum of Every subArray and 
find the min and max of that sums*/


//It is didi's soln I think it's more optimal 

public class Array9 {
    public static void findMaxSubArrSum(int a[])
    {
        int sum=0,maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i; j < a.length; j++)
            {
                sum = 0;
                for(int k = i; k<=j ; k++)
                {
                    sum += a[k];
                }
                if(maxSum < sum)
                    maxSum = sum;
            }
        }
        System.out.println("Max Sum = "+ maxSum);
    }
}
