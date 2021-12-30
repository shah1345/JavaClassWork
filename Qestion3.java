
 class Shirt {
     private String color;
     private double price;

     public Shirt(String color,double price){
         this.color=color;
         this.price=price;

     }

     public String getColour(){

         return color;

     }


     public Double getPrice(){

         return price;

     }


     void SetColour(String Colour){

         this.color=Colour;

     }

     void SetPrice(double Price){

         this.price=Price;

     }

}






public class Qestion3 {
    public static void main(String []args){

        Shirt S1 = new Shirt("Red",550.25);
        Shirt S2 = new Shirt("Green",950.5);
        Shirt S3 = new Shirt("Yellow",750.15);

        S3.SetPrice(550);

        S1.SetColour("Maroon");

        System.out.println(S3.getPrice());
        System.out.println(S1.getColour());

    }
}
