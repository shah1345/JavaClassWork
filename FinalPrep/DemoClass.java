package FinalPrep;


public class DemoClass {

    static class demoClass{

        private final double pi=3.1416;

        void calculateArea(double radius){

            System.out.println("area: "+pi*radius*radius );

        }

    }

    public static void main(String[] args) {

        demoClass d = new demoClass();

        d.calculateArea(7.6) ;

    }

}