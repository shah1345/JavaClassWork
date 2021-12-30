abstract class Animal{
    // instance variables
    String name, color;
    double weight;
    // Constructors
    Animal(){ }
    Animal(String name, String color){
        this(name,color, 0.0);
    }
    Animal(String name, String color, double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    // Concrete methods
    public void eat(){
        System.out.println(name + " eats.");
    }
    // abstract methods
    public abstract void makeSound();
}

class Bird extends Animal{
    public Bird() {
        name = "Bird";
    }
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}
class Tiger extends Animal{
    public Tiger() {
        name = "Tiger";
    }
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}

interface Flyable{
    public static final String media = "Sky";
    public abstract void fly();
    public abstract boolean needFuel();
}





public class Ono {
    public static void main(String[] args) {

        Animal b = new Bird();
        Animal t = new Tiger();
        b.eat();
        t.eat();
        b.makeSound();
        t.makeSound();

    }

}
