

public class Laptop {
    String model;
    String company ;
    double weight;

    Laptop( String model, String company, double weight){
        this.model=model;
        this.company=company;
        this.weight=weight;

    }

    void printData(){

        System.out.println("Laptop Model " + model + " Company "+ company + " weight " + weight );
    }


    public static void main(String[] args) {

        Laptop L1= new Laptop("2017","Dell",856);
        Laptop L2= new Laptop("2468","lenevo",1507);
        Laptop L3= new Laptop("2020","Asus",1957);

        L1.printData();
        L2.printData();
        L3.printData();




    }

}
