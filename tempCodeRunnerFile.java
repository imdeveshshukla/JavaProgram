import java.util.MissingFormatWidthException;

public class tempCodeRunnerFile {
    public static void main(String[] args) {
        int d = 20;
        try{
            double a = 4.129;
            System.out.printf("%.2f ",a);
        }
        catch(MissingFormatWidthException e)
        {
            System.out.println(e.getFormatSpecifier());
        }
    }
}