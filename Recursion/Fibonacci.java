package Recursion;

public class Fibonacci {
    public static int find(int n)
    {
        if(n<=0)
            return 0;
        else
        {
            return find(n-1)+find(n-2);
        }
    }
}