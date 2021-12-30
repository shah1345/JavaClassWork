import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class usrtd {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] data = new int[10];
            for (int i = 0; i < data.length; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                data[a] = b / c;
            }
        }
        catch (InputMismatchException e){
            System.out.println("All inputs must be Integers");
        }
        catch(ArithmeticException e){
            System.out.println("Input for c cant be 0");
        }

    }
}