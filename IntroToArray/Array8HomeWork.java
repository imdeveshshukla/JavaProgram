package IntroToArray;

/* Ques. Find Sum of Every subArray and 
find the min and max of that sums*/


/*Soln My soln is to creat an another array to store sums of 
all Subarrays and find min and max from it */

public class Array8HomeWork {
    public static void findSum(int a[]){
        int n = a.length;
        int ts = n*(n+1)/2;
        int sums[] = new int[ts];
        int Sum,f = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                Sum = 0;
                for(int k = i; k <= j; k++)
                {
                    System.out.print(a[k]+" ");
                    Sum+= a[k];
                }
                sums[f]=Sum;
                System.out.println(" => "+sums[f]);
                f++;
            }
            System.out.println();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("----------------------------");
        for(int i = 0; i < ts; i++)
        {
            if(max<sums[i])
                max = sums[i];
            if(min>sums[i])
                min = sums[i];
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);

    }
}
