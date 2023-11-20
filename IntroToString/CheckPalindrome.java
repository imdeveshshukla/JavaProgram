package IntroToString;

public class CheckPalindrome {
    public static void isIt(String n){

        long start = System.nanoTime();
        //WriteCodeHere........
        //...............
        //..............

        int l = n.length();
        int i = 0;
        int j = n.length()-1;
        int flag = 0;
        while (i!=(l/2)) 
        {
            if(n.charAt(i)!= n.charAt(j))
            {
                flag = 1;
                break;
            }
            i++;
            j--;
        }
        if(flag == 1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");

            
        long finish = System.nanoTime();
        float timeElapsed = (finish - start)/(float)Math.pow(10, 5);
        System.out.println("_____________________TOTAL TIME TAKEN_____________________");
        System.out.println(timeElapsed);
    }
}
