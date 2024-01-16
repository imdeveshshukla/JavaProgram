package LeetCode;

import java.util.HashMap;

public class LongestSubstring3 {
    public static int lengthOfLongestSubstring(String s) {
        int ans,l,r;
        ans = l = r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                    
            }
            else{
                map.put(ch, i);
                ans = map.size()>ans?map.size():ans;
            }
        }
        return ans;
    }
}
