package IntroToArray;

import java.util.Arrays;

public class CycleSort {
    public static void sortKarDo(int[] a)
    {
        long start = System.nanoTime();
        //WriteCodeHere........
        //...............
        //..............
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if(a[correct] != a[i])
                Swap.number(a,correct,i);
            else
                i++;
        }
        System.out.println(Arrays.toString(a));
        long finish = System.nanoTime();
        float timeElapsed = (finish - start)/(float)Math.pow(10, 5);
        System.out.println("_____________________TOTAL TIME TAKEN_____________________");
        System.out.println(timeElapsed);
    }
}
