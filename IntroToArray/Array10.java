package IntroToArray;
public class Array10 {
    public static void findSumSubArr(int a[]){
        int prefix[]=new int[a.length];
        prefix[0] = a[0];
        int currSum;
        System.out.print(prefix[0]+" ");
        for(int i = 1; i < a.length; i++)
        {
            prefix[i] = prefix[i-1]+a[i];
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i; j < a.length; j++)
            {
                currSum = i==0 ? prefix[0]:prefix[j] - prefix[i-1];
                System.out.println(currSum);
            }
        }
    }
}
