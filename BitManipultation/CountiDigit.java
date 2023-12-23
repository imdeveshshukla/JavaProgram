package BitManipultation;
public class CountiDigit{
    public static void search(int numberInDecimal,int base)
    {
        int f = (int)(Math.log(numberInDecimal)/Math.log(base) + 1);
        System.out.println(f);
    }
}