package Recursion;
import java.util.ArrayList;

public class subset{
    public static ArrayList<String> find(String s)
    {
        ArrayList<String> a = new ArrayList<>(); 
        // return helper("",s,a);
        return helper2("", s);
    }

    
    static ArrayList<String> helper2(String p,String up)
    {
        if(up=="")
        {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> left = helper2(p+up.substring(0,1), up.substring(1));
        ArrayList<String> right = helper2(p, up.substring(1));
        right.addAll(left);
        return right;
    }
    static ArrayList<String> helper(String processedStr,String unprocessStr,ArrayList<String> a)
    {
        if(unprocessStr == "")
        {
            a.add(processedStr);
        }
        // String temp = unprocessStr.charAt(0)+"";
        else
        {
            helper(processedStr+unprocessStr.substring(0,1), unprocessStr.substring(1), a);
            helper(processedStr+"", unprocessStr.substring(1), a);
        }
        return a;
    }
}