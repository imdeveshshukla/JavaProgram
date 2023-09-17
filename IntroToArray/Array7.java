package IntroToArray;

/**
 * Array7
 */
public class Array7 {

    public static void makePair(int a[]){
        int tp = 0;
        for(int i = 0; i < a.length; i++)
        {
            
            for(int j = i+1; j < a.length; j++)
            {
                System.out.print("("+a[i]+","+a[j]+") ");
                tp++;
            }

            System.out.println();
        }
        System.out.println("--------------Total Pairs--------------"+tp);
    }
}