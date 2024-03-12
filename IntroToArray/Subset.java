package IntroToArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static ArrayList<ArrayList> find2(int a[]){          //If array has duplicate elements
        ArrayList<ArrayList> outer  = new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        Arrays.sort(a);
        int end = 0;
        int start = 0;
        for (int i = 0; i < a.length; i++) {
            int n = outer.size();
            start = 0;
            if(i>0 && a[i]==a[i-1])
                start = end+1;
            while (start<n) {
                ArrayList<Integer> inner = new ArrayList<Integer>(outer.get(start));   //Copying outer List Element
                inner.add(a[i]);
                outer.add(inner);
                start++;
            }
            end = start-1;
        }
        return outer;
    }
    public static ArrayList<ArrayList> find(int a[])
    {
        ArrayList<ArrayList> outer = new ArrayList<>();
        outer.add(new ArrayList<>());       //Adding Empty List
        for (int i = 0; i < a.length; i++) {
            int n = outer.size();
            // System.out.print(n);
            System.out.println(outer);
            for(int j=0;j<n;j++)
            {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));   //Copying outer List Element
                inner.add(a[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
