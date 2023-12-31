package Recursion;

public class Factorial {
    public static int findMy(int n){
        if(n<=1)
            return 1;
        else
            return n*findMy(n-1)*findMy(n-2);
    }
    public static int findActual(int n){
        if(n==1)
            return 1;
        else
            return n*findActual(n-1);
    }
}
