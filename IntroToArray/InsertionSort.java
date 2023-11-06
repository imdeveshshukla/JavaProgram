package IntroToArray;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int a[])
    {
        for (int i = 0; i < (a.length-1); i++)
        {
            // int j = i+1;
            // while (j>0) {
            for(int j = i+1; j > 0 ; j--)
            {
                if(a[j]>a[j-1])
                    break;
                else
                {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
                // j--;
            }    
        }
        System.out.println(Arrays.toString(a));
    }
}
