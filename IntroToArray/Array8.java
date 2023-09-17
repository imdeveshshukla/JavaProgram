package IntroToArray;

public class Array8 {
    public static void printSubArray(int a[]){
        int ts = 0;
        for(int i = 0; i < a.length; i++)
        {
            // System.out.print("{"+a[i]+"} ");
            for(int j = i; j < a.length; j++)
            {
                System.out.print("{");
                for(int k = i; k <= j ; k++)
                {
                    System.out.print(a[k]+" ");
                }
                ts++;
                System.out.print("} ");
            }
            System.out.println();
        }
        System.out.println("--------------Total SubArray--------------"+ts);
    }
}