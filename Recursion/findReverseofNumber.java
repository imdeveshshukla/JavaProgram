package Recursion;

public class findReverseofNumber {
    static int rev = 0;
    public static int find(int n)
    {
        rev = rev*10+(n%10);
        if(n<10)
            return n;
            
        return find(n/10);
    }
    public static int getrev()
    {
        return rev;
    }
    public static int find2(int n)
    {

        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);

    }
    private static int helper(int n,int digits){
        if(n%10==0)
            return n;
        int temp = n%10;
        return temp*((int)Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
