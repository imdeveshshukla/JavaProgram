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
    public static void main(String[] args) {
        // int n = 64;
        // System.out.println(isPowerOfFour(n));
        ArrayList<Integer> left = new ArrayList<>();
        left.add(2);
        ArrayList<Integer> ans = left;
        ArrayList<Integer> right = new ArrayList<>();
        right.add(3);
        ans = right;
        System.out.println(ans+" "+left+" "+right);
        
    }
}