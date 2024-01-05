import java.util.*;
class TempCode{
    static boolean isPalindrome(String s){
        int k = s.length()-1;
        for(int i=0;i<(s.length())/2;i++)
        {
            if(s.charAt(i)!=s.charAt(k))
                return false;
            k--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(),a = "";
        int l = s.length();
        int total = (l*(l+1))/2;
        String ans[] = new String[total];
        boolean found = false;
        int index = 0;
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j>i;j--){
                a = s.substring(i,j);
                
                System.out.println(a);
                if(isPalindrome(a))
                {
                    found = true;
                    ans[index] = a;
                    index++;
                }
            }   
        }
        System.out.println(Arrays.toString(ans));
    }
}