package Recursion;
public class HelloWorld {
    public static void say(int i)
    {
        if(i==0)
            return;

        System.out.print("Hello World");
        i--;
        say(i);
    }
}
