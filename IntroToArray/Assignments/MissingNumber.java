//Question 
//https://leetcode.com/problems/missing-number/submissions/1094094699/


package IntroToArray.Assignments;

import java.util.Arrays;

public class MissingNumber {
    public static void find(int a[])
    {
        for(int i = 0; i < a.length; )
        {
            int correct = a[i]-1;
            System.out.println(a[i]+" = "+correct);
            if(a[i]!=a[correct])        
            {
                IntroToArray.Swap.number(a, i, correct);
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(a));
    }
}
