/**
 * PatternTriangle
 * Pattern1 = * * * * * 
             * * * * * 
            * * * * *  
           * * * * *   
          * * * * *  
    Pattern2 :    
     *     
    * *    
   * * *   
  * * * *  
 * * * * *
 * Pattern 3:
 
 * 
 */
public class PatternTriangle {
    public static void pattern1(int n){
        int col = 0;
        for (int row = 0; row < n; row++) 
        {
            int noOfSpace =(n-row) ;
            for (int i = 0; i < noOfSpace; i++) {
                System.out.print(" ");
            }  
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        int col = 0;
        for (int row = 0; row < n; row++) 
        {
            int noOfSpace =(n-row) ;
            for (int i = 0; i < noOfSpace; i++) {
                System.out.print(" ");
            }  
            for (int i = 0; i <= row; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        int col = 0;
        for (int row = 0; row < 2*n; row++) 
        {
            int noOfSpace =row>n?(row-n):(n-row) ;
            for (int i = 0; i < noOfSpace; i++) {
                System.out.print(" ");
            }  
            if(row<=n)
            for (int i = 0; i <= row; i++) {
                System.out.print("* ");
            }
            else
            for (int i = n-1; i > 0; i--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern3(5);
    }
}

// https://www.simplilearn.com/tutorials/java-tutorial/pattern-programs-in-java#pattern_1