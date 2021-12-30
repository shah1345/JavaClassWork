import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String s = sc.next();
            int a = Integer.valueOf(s);
            int b = sc.nextInt();
            int c = sc.nextInt();
            int [] array = new int[5];
            int d = a / b;
            array[c] = d;
            System.out.println(array[c]);
        }
        catch (NumberFormatException e){
            System.out.println("Input was not an Integer.");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index should be less than 5");
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide by 0");
        }
    }
}