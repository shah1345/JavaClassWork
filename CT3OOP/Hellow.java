package CT3OOP;

public class Hellow {

   public static int BurgerEatX = 0;
    public static int BurgerEatY = 0;
    public static int done = 0;



    public static void main(String[] args) {



        int a = 8, b =10 ;
        String st = "How are you doing?";
        System.out.println(st.substring(a, b));














     /*   Random rand = new Random();

        started(rand.nextInt(2));





       while ((BurgerEatX<2 || BurgerEatY<2) && done==0){

           burgersEat(rand.nextInt(2));

       }



        finished();

*/


    }


    public static void started(int ran){

if(ran==0){
    System.out.println("X has started eating");
    System.out.println("Y has started eating");

} else {
    System.out.println("Y has started eating");
    System.out.println("X has started eating");


}



    }

    public static void burgersEat(int ran){
        if(ran==0){
            BurgerEatX++;
            System.out.println("X has he/she has finished eating : "+ BurgerEatX );
            System.out.println("Y has he/she has finished eating: " + BurgerEatY);

        } else {
            BurgerEatY++;
            System.out.println("X has he/she has finished eating : "+ BurgerEatX);
            System.out.println("Y has he/she has finished eating: " + BurgerEatY);


        }





    }

    public static void finished(){

        done=1;
        System.out.println("Contestant has finished eating" );

        if(BurgerEatX>=3){

            System.out.println("X has finished eating");
        } else  System.out.println("Y has finished eating");



    }




}
