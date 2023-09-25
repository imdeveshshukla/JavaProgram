package IntroToArray;
public class BuyandSellStocks {
    public static void meraMethod(int a[]){
        int bp = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < a.length; i++)
        {
            int temp = 0;
            int sp = a[i];
            if(a[i]<bp)
                bp = a[i];
            if(sp > bp)
                temp = sp - bp;
            if(temp > profit)
                profit = temp;
        }
        System.out.println("Profit = "+profit);
    }
}
