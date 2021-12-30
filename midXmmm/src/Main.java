
 class Flower{

    private int nPetals;
    private String color;

     Flower(int nPetals, String col){
        this.nPetals = nPetals;
        this.color= color;

    }

     public Flower() {

         this(0,"a");

     }

     public void printName(){
        System.out.println("Flowe");
    }


     public int getnPetals(){
         return this.nPetals;


     }

     public String getnColor(){
         return this.color;


     }


     public void SetColor(String col){
         this.color=col;


     }
     public void SetPetals(int nPetals){
         this.nPetals=nPetals;


     }





}



class Flowerchild extends Flower{

    private String flowerName;



    Flowerchild(int nPetals, String col,String name ) {

        this.flowerName=name;

        SetPetals(nPetals);
        SetColor(col);


    }

    public String getname(){
        return this.flowerName;


    }

    public void setName(String namee){
        this.flowerName=namee;


    }


    void printFlower(Flower a){

        System.out.println(flowerName);



    }


}





public class Main {

    public static void main(String[] args) {

Flower a = new Flower(1,"black");

a.printName();




    }


}
