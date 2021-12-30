package Assignment;

class Gadget{
    private String name;
    private String brand ;
    private double price ;
    private int year  ;

    public Gadget(String name, String brand, double price, int year) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.year = year;
    }



    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }
}



class SmartWatch extends Gadget {
    String color;


    SmartWatch(String name,String brand, double price ,int year, String color ){
        super(name,brand,price,year);

        this.color = color;



    }






   public double getPrice(){

       if(super.getPrice()>1000){

           return  super.getPrice() - ( super.getPrice()* 0.05) ;

       } else return  super.getPrice();



    }

    void printInfo(){

System.out.println(super.getName() + " "+ super.getBrand() + " " + getPrice() + " " + color);


        // if u need actual price
        //    System.out.println(super.getName() + " "+ super.getBrand() + " " + super.getPrice() + " " + color);




    }

}


class HeadPhone extends Gadget {
    String type;

    HeadPhone(String name,String brand, double price, int yesr , String type ){
        super(name,brand,price,yesr);


        this.type = type;



    }


    public double getPrice(){

        if(super.getYear()<2010){

            return super.getPrice()-150;

        } else  if(getYear()<=2015 && getYear()>2010 ){

            return super.getPrice()-100;

        } else   return super.getPrice()-50;





    }
     void printInfo(){

        System.out.println(super.getName() + " "+ super.getBrand() + " " + getPrice() + " " + super.getYear() + " " + type );

      // if u need actual price
      //    System.out.println(super.getName() + " "+ super.getBrand() + " " + super.getPrice() + " " + super.getYear() + " " + type );


    }






}


public class Maintest {
    public static void main(String[] args) {



        SmartWatch Watcher = new SmartWatch("ConnectX","ShahXConnect",3999,2021,"Black");

        HeadPhone H1 = new HeadPhone("V2","Lenevo",2020,2015,"Wireless");

        Watcher.printInfo();
        H1.printInfo();







    }


}





