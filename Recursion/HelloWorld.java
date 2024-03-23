package Recursion;
public class HelloWorld {
    public static void say(int i)
    {
        

        if(i!=1)
            say(i-1);

        System.out.println("Number = "+i);
    }
}
