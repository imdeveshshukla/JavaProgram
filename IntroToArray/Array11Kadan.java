package IntroToArray;

public class Array11Kadan {
    public static void findSum(int a[]){
        int currSum = 0,maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++)
        {
            currSum += a[i];
            if (currSum<0)
                currSum = 0;
            if (currSum>maxSum)
                maxSum = currSum;
            /*But this solN will not work for every negative number,
            for every negative no it will give sol 0
            
            
            we can use another loop for every negative number
            and if all are negative then we can
             print smallest negative number */
        }
        System.out.println("MaxSum of SubArrays(From Kadans ALGo) = "+maxSum);
    }
}
