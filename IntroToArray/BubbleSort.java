//https://youtu.be/F5MZyqRp_IM?si=TBwAtDP0FlXpVM4f&t=947
package IntroToArray;

import java.util.Arrays;

public class BubbleSort{
    public static void sort(int a[]) throws InterruptedException{
        long start = System.currentTimeMillis();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for(int j = 1; j < (n-i); j++){
                if(a[j] < a[j-1])
                {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        long finish = System.currentTimeMillis();
        float timeElapsed = (finish - start);
        System.out.println("_____________________TOTAL TIME TAKEN_____________________");
        System.out.println(timeElapsed);
    }
    public static void meraMethod(int a[]){
        int n = a.length;
        long start = System.currentTimeMillis();
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
        long finish = System.currentTimeMillis();
        float timeElapsed = (finish - start);
        System.out.println("_____________________TOTAL TIME TAKEN_____________________");
        System.out.println(timeElapsed);
    }
}