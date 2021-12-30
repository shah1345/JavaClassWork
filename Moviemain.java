 class Movie2 {


    String Name;
    String Director;
    String ReleasedYear;


    public void Movie() {

        System.out.println("This is a movie");
    }


    public Movie2(String name,String Director,String ReleasedYear) {

        this.Name=name;
        this.Director=Director;
        this.ReleasedYear=ReleasedYear;




    }






}


     class SciFi extends Movie2 {

         public SciFi(String name, String Director, String ReleasedYear) {
             super(name, Director, ReleasedYear);
         }
     }





 public class Moviemain
 {
     public static void main(String[] args) {


         Vehicle[] Veh = new Vehicle[5];

         Private_vehicle Vh1 = new Private_vehicle("shah",1000,200);
         Private_vehicle Vh2 = new Private_vehicle("sabrina",20,5000);
         Private_vehicle Vh3 = new Private_vehicle("esha",120,600);
         Public_vehicle Vh4 = new  Public_vehicle("corola",560,4800);
         Public_vehicle Vh5 = new  Public_vehicle("BMW",40,50);

         Veh[0]= Vh1;
         Veh[1]= Vh2;
         Veh[2]= Vh3;
         Veh[3]= Vh4;
         Veh[4]= Vh5;



         for(int i=0 ; i<5 ; i++){

             System.out.println(Veh[i].Grade() + "  " + Veh[i].totalTax());

         }


     }
 }






