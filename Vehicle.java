
class PublicVehicle extends Vehicle{
    private double fitnessTax;
    private double roadTax;
    private String grade;
    public double totaltax;

    PublicVehicle(String grade, double roadTax, double fitnessTax) {

        this.fitnessTax=fitnessTax;
        this.roadTax=roadTax;
        this.grade=grade;



    }

    double totalTax() {

        return totaltax= 2*(fitnessTax+roadTax);
    }
}

class PrivateVehicle extends Vehicle{
    private double fitnessTax;
    private double totaltax;
    private double roadTax;



    void PublicVehicle(String grade, double roadTax, double fitnessTax) { //assign the variables

        this.fitnessTax=fitnessTax;
        this.roadTax=roadTax;
        this.totaltax=fitnessTax;



    }


    double totalTax() {

        return totaltax= 2.5*( fitnessTax+roadTax);
    }
}











public class Vehicle {

    String grade;
    Double roadTax;



}
