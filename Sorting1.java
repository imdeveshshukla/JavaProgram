// package NEW2023;
import java.util.Scanner;
public class Sorting1 {
    public static void main(String[] args) {
        int Arr[]=new int[10];
        int temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("______________Enter Elemets in Array for Sorting____________");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();    
        }
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                if (Arr[i]<Arr[j]){
                    temp = Arr[i];
                    Arr[i]= Arr[j];
                    Arr[j]= temp;
                }
            }
        }
        System.out.println("!!!!!Sorted!!!!!");
        for (int i : Arr) {
            System.out.println(i);
        }
    }
}
