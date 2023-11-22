package Recursion;
public class HelloWorld {
    public static String say(int i){
        if(i==0)
            return "";
        else
        {
            System.out.println("Hello World");
            i--;
        }
        return say(i);
    }
}
