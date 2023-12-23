package Recursion;
public class HelloWorld {
    public static int say(int i)
    {
        if(i==1)
            return 1;
        
        System.out.println("Number = "+i);
        return say(--i);
    }
}
