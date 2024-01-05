package Recursion;

import java.util.ArrayList;

public class linearSearch {
    public static ArrayList<Integer> find(int arr[],int i,int target,ArrayList<Integer> ls)
    {
        if(i==arr.length)
            return ls;
        if(arr[i]==target)
            ls.add(i);

        return find(arr,i+1,target,ls);
    }
    public static ArrayList<Integer> find2(int a[],int i,int target)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(i==a.length)
            return ans;
        if(a[i]==target)
            ans.add(i);

        ans.addAll(find2(a,i+1,target));
        return ans;
    }
}
