import java.util.Arrays;

public class TempCodeRunner {
    public static void main(String[] args) {
        int a[][] = new int[4][];
      int n =4;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          a[i][j] = 1;
      }
    }
      System.out.println(Arrays.toString(a));
    }
}
