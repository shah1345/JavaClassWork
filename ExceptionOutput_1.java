class NestedException {
    public static void main(String args[]){
        try {
            try{
                System.out.println("Inside B");
                int m = 115 / 0;
                System.out.println(m);
            }  catch (ArithmeticException el) {
                System.out.println("Exception: E2");
            }
            try {
                System.out.println("Inside A");
                int m = 110 / 0 ;
                System.out.println(m);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Exception: E1");
            }
            System.out.println("Just other statement");
        } catch (ArithmeticException e3) {
            System.out.println("Arithmetic Exception");
            System.out.println("Inside parent try catch block");
        } catch (ArrayIndexOutOfBoundsException e4) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Inside parent try catch block");
        }  catch (Exception e5) {
            System.out.println("Exception");
            System.out.println("Inside parent try catch block");
        }
        System.out.println("Lets give another input");
    }
}
