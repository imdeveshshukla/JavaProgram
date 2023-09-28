package IntroToArray.Assignments;

public class Ques3 {
    public static void main(String[] args) {
        int a[] = {7,6,4,3,1};
        findMaxProfit(a);
    }
    public static void findMaxProfit(int a[])
    {
        int basePrice = a[0],profit = 0;
        for(int i = 0; i < a.length; i++)
        {
            int p;
            if(basePrice > a[i])
            {
                basePrice = a[i];
            }
            p = a[i]-basePrice;
            if(p>profit)
                profit = p;

        }
        System.out.println("Max Profit = "+profit);
    }
    
}
