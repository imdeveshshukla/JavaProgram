package IntroToArray;

import java.util.ArrayList;

public class Subset {
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
