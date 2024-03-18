package Recursion.Leetcode;

import java.util.ArrayList;

public class Prob1 {
    static String combinationStrings[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static ArrayList<String> find(String p,String up)
    {
        if(up.isEmpty())
        {
            // System.out.println(p);
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int digit = up.charAt(0) - '2';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < combinationStrings[digit].length(); i++) {
            ans.addAll(find(p+combinationStrings[digit].charAt(i), up.substring(1))); 
        }
        return ans;

    }
    public static ArrayList<String> find2(String p,String up)
    {
        if(up.isEmpty())
        {
            // System.out.println(p);
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int digit = up.charAt(0) - '2';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < combinationStrings[digit].length(); i++) {
            ans.addAll(find(p+combinationStrings[digit].charAt(i), up.substring(1))); 
        }
        return ans;

    }
}
