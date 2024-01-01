package Recursion;

public class countZero {
    public static int start(int n){
        return helper(n, 0);
        
        
    }
    public static int helper(int n,int count){
        if(n==0)
            return count;
    
        if(n%10 == 0 && n!=0 )
            return helper(n/10,count+1);
        else
            return helper(n/10, count);
    }
}
