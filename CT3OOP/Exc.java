package CT3OOP;





class IllegalParameterException extends Exception {

    public IllegalParameterException() {
        super("IllegalParameterException");


    }


}









public class Exc {

    public static void main(String[] args) throws IllegalParameterException {


int nbr =3;




try {
    testmetgod(nbr);

} catch (IllegalParameterException e) {


    System.out.println("IllegalParameterException");


}






    }




    public static int testmetgod(int num) throws IllegalParameterException {


        if(num<0){

            throw new IllegalParameterException();


        } else if(num % 3==0) {

            throw new IllegalParameterException();

        }


return 0;




    }




}
