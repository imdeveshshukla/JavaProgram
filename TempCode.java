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
    public static void main(String[] args) {
        int n = 64;
        System.out.println(isPowerOfFour(n));
        
    }
}