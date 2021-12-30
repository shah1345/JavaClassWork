class Vehicle {



    String grade;
    Double roadTax;
    Double totaltax;


    Vehicle(String grade, double roadTax){


        this.grade=grade;
        this.roadTax=roadTax;


    }

    public Vehicle() {
        this("",0);
    }


    Double totalTax(){
        return roadTax;
    }

    String Grade(){
        return grade;
    }


}



class Public_vehicle extends Vehicle{

    Double fitnessTax;

    Public_vehicle(String grade, double roadTax, double fitnessTax){
        this.grade=grade;
        this.roadTax=roadTax;
        this.fitnessTax=fitnessTax;


    }



    Double totalTax(){

        return totaltax=2*(fitnessTax+roadTax);

    }



}


class Private_vehicle extends Vehicle{

    Double fitnessTax;

    Private_vehicle(String grade, double roadTax, double fitnessTax){
        this.grade=grade;
        this.roadTax=roadTax;
        this.fitnessTax=fitnessTax;

        }
    Double totalTax(){
        return  2.5*(fitnessTax+roadTax);
    }



}


public class Main
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
