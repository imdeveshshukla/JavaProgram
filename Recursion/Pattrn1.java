/*
  |* * * * 
  |* * *
  |* *
  |*

 */
package Recursion;
 public class Pattrn1{
    public static void printPat(int r,int c){
        if(r<=0)
            return;
        if(r!=c)
        {
            printPat(r, c+1);
            System.out.print("* ");
        }
        else{
            printPat(r-1, 0);
            System.out.println();
        }
    }
 }