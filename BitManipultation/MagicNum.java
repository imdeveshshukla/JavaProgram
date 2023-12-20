package BitManipultation;
public class MagicNum{
    public static void find(int n){
        int k = 1,ans =0;
        while (n!=0) {
            int d = n&1;
            ans += d*Math.pow(5,k);
            n = n>>1;
            k++;
        }
        System.out.println("Magic Number = "+ans);
        return ;
    }
}