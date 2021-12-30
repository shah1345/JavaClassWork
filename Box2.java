import java.util.InputMismatchException;


 class TestException {
    public static void main(String[] args) {
        int num = 4;
        try {
            try {
                throwException(num);
            } catch (InputMismatchException e) {
                System.out.println("Inner catch " + e.getMessage());
                throwException(++num);
            } finally {
                System.out.println("I am out of here");
            }
        } catch (Exception e) {
            System.out.println("Outer catch " + e.getMessage());
        }
    }

    public static void throwException(int num) {
        if (num % 2 == 0) {
            throw new InputMismatchException("can’t be an even number");
        }
         else if (num % 5 == 0) {
                throw new NumberFormatException("can’t be a multiple of 5");
            } else {
                System.out.println("Input: " + 5);
            }
        }
    }

