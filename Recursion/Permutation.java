package Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void find(String p,String up)
    {
        if(up.length() == 0)
        {
            System.out.println(p);

            return;
        }

        char ch = up.charAt(0);

        for(int i=0;i<=p.length();i++)
        {
            String f = p.substring(0,i)+ch+p.substring(i);
            find(f,up.substring(1));
        }
    }

    public static ArrayList<String> findlist(String p,String up)
    {
        if(up.length() == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++)
        {
            String f = p.substring(0,i)+ch+p.substring(i);
            
            ans.addAll(findlist(f,up.substring(1)));
        }
        return ans;
    }
    
}
