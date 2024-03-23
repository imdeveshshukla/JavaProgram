package Recursion.Leetcode;

public class Prob2 {
    public static void find(String p,int up)
    {
        if(up==0)
        {
            System.out.println("In side if"+p+" "+up);
            return;
        }
        for(int i=1;i<=up;i++)
        {
            // System.out.println(i+"In side loop but before"+p+" "+up);
            find(p+" "+i,up-i);
            // System.out.println(i+"In side loop but after"+p+" "+up);
        }
        System.out.println();
    }
}
