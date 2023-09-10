/**
 * HollowRectPattern
 */
public class HollowRectPattern {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if(i==0 || i==n-1)
                    System.out.print("*");
                else
                    if(j==0 || j==n-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//Output: -
// java HollowRectPattern 10
// **********
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// **********