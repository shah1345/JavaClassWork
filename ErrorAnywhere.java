import java.util.Scanner;

class ErrorAnywhere {
    public static void main(String args[])
    {
        int a, b, c = 4;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        try{
            a = a/a;
            c = c + 1;
            b = b / b;
            c = c + 1;
          
        }
        catch(ArithmeticException f){
            System.out.println(c);
        }finally{
            System.out.println("END");
        }
    }
}
