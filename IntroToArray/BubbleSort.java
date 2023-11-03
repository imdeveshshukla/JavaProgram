//https://youtu.be/F5MZyqRp_IM?si=TBwAtDP0FlXpVM4f&t=947
package IntroToArray;

import java.util.Arrays;

public class BubbleSort{
    public static void sort(int a[]) throws InterruptedException{
        long start = System.nanoTime();
        int n = a.length;
        boolean swap;
        for (int i = 0; i < n; i++)
        {
            swap = false;
            for(int j = 1; j < (n-i); j++)
            {
                //swap if prev element is greater then current one
                if(a[j] < a[j-1])
                {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    swap = true;
                }
            }
            //if you did not swap any particular value of i(which is our pass(see notebook)) then array is sorted
            if (!swap) 
                break;    
        }
        System.out.println(Arrays.toString(a));

        long finish = System.nanoTime();
        float timeElapsed = (finish - start)/(float)Math.pow(10, 5);
        System.out.println("_____________________TOTAL TIME TAKEN_____________________");
        System.out.println(timeElapsed);
    }
    public static void meraMethod(int a[]){
        System.out.println("This is mera method");
        int n = a.length;
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
        long finish = System.nanoTime();
        float timeElapsed = (finish - start)/(float)Math.pow(10, 5);
        System.out.println("_____________________TOTAL TIME TAKEN_____________________");
        System.out.println(timeElapsed);
    }
}