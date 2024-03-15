import java.lang.reflect.Array;
import java.util.*;
class TempCode{
    public static boolean isPowerOfFour(int n) {
        while (n!=0) {
            if(n==4)
                System.out.println("true");
            n = n>>2;
        }
        return false;

    }
    public static int pivotInteger(int n) {
        int i = 1;
        int suml = i,sumr = n;
        while(i<=n)
        {
            if(suml==sumr && i==n)
            {
                return i;
            }    
            else if(suml<sumr)
            {
                i++;
                suml +=i;
            }
            else
            {
                n--;
                sumr+=n;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        // int n = 64;
        // System.out.println(isPowerOfFour(n));
        for(int i = 1;i<=1000;i++)
        {
            if(pivotInteger(i)!=-1)
                System.out.println(i);
        }
        
    }
}