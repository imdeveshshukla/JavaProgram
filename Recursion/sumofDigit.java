package Recursion;

public class sumofDigit {
    public static int find(int n){
        if(n==0)
            return 0;
        
        return find(n/10)+n%10;
    }
}
