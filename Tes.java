
class aAnimal{

    public aAnimal(String color) {

    }

    void sleep(){

        System.out.println(("Animal is sleeping"));

    }

}





class Lion extends aAnimal {
    String name;

    Lion(String color, String name){

        super(color);
        this.name=name;

    }
    void roar(){

        System.out.println(("Lion is roaring!"));

    }



}



public class Tes {
    public static void main(String[] args){
        Lion l = new Lion("Golden", "Leo");
        System.out.println(l.name);
        l.sleep();
        l.roar();


    }

}
