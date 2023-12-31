package Recursion;

public class countZero {
    public static int start(int n,int count){
        if(n==0)
            return count;

        if(n%10 == 0 && n!=0 )
            start(n/10,count+1);
        else
            start(n/10, count);
        
        return count;
    }
}
