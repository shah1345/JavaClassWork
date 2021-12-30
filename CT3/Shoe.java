package CT3;


class ShoeCladd {

     String color;
    int size;
     double price;




     ShoeCladd(String color, int size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public ShoeCladd() {

    }

    double getPrice() {


        return price;

    }



      static class MenShoe extends ShoeCladd {


         MenShoe(String color, int size, double price) {
            super(color, size, price);
        }

        @Override
        double getPrice() {
            return price + (size * 10);
        }
    }




      static class WomenShoe extends ShoeCladd {

         WomenShoe(String color, int size, double price) {
            super(color, size, price);
        }

        @Override
        double getPrice() {
            return price + ((price * size) / 100);
        }
    }


}


public class Shoe {
    public static void main(String[] args) {


        ShoeCladd[] Sata = new ShoeCladd[3];
         Sata[0] = new ShoeCladd.MenShoe("black",5,505.45);
         Sata[1] = new ShoeCladd.WomenShoe("black",5,505.45);
         Sata[2] = new ShoeCladd.MenShoe("black",5,505.45);



         double sum=0;


         for(int i=0; i<Sata.length; i++){

             sum+=  Sata[i].getPrice();


         }

         System.out.println(sum);




    }
}
