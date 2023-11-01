package IntroToArray;
public class Arr2DBinSearch {
    public static int[] findElem(int[][] a,int key){
        int i = 0, j = a.length - 1;
        while (i<a.length && j>=0) {
            if(a[i][j] == key)
                return new int[]{i,j};
            else if(a[i][j] < key)
                i++;
            else
                j--;
        }
        return new int[]{-1,-1};
    }    
}
