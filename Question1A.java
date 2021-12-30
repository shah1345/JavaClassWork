


class Calculator{


    int first_add( int parameter1, int parameter2){

        return parameter1+ parameter2;

    }


    Double second_add( int parameter1, Double parameter2){

        return parameter1+ parameter2;

    }

    Double third_add( int parameter1, Double parameter2,Double parameter3){

        return parameter1+ parameter2;

    }



}





public class Question1A {
    public static void main(String[] args) {


        Calculator Callernew = new Calculator() ;

        Callernew.first_add(10,20);
        Callernew.second_add(10,5.12);
        Callernew.third_add(50,5.21,40.65);


    }


}
