
public class ExceptionOutput_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try{
            System.out.println("Start Change");
            arr[10] = 11 / 0;
            System.out.println("Exception might be created");
        }catch(ArithmeticException e){
            System.out.println("Inner Catch 1");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Inner Catch 2");
        }
        finally {
            System.out.println("Inside finally block");
        }
        System.out.println("End Change");
    }
}