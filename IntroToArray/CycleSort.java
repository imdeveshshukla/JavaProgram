package IntroToArray;

import java.util.Arrays;

public class CycleSort {
    public static void sortKarDo(int[] a)
    {
        long start = System.nanoTime();
        //WriteCodeHere........
        //...............
        //..............
        for (int i = 0; i < a.length; i++) {
            System.out.print("I m at loop"+i);
            int correct = a[i] - 1;
            while (a[correct]!=a[i])
            {
                System.out.println(a[i]+"/"+a[correct]);
                Swap.number(a,i,correct);
                System.out.print("After Swaping = ");
                System.out.println(a[i]+"/"+a[correct]);
            }
        }
        System.out.println(Arrays.toString(a));
        long finish = System.nanoTime();
        float timeElapsed = (finish - start)/(float)Math.pow(10, 5);
        System.out.println("_____________________TOTAL TIME TAKEN_____________________");
        System.out.println(timeElapsed);
    }
}
