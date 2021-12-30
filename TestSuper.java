class Parent {
    String name;
    void message(){
        System.out.println("Welcome to Parent class."); }
}
// Create a subclass by extending class parent.
class Child extends Parent {
    String name; // this name hides the name in Parent
    public Child(String a, String b) {
        super.name = a; // name in A
        name = b; // name in B
    }
    void show() {
        System.out.println("superclass’s name: " + super.name + "; subclass’s name: " + name); }
    //method overriding
    void message(){
        System.out.println("Welcome to Child class."); }
    void display(){
        message();//will invoke current class message() method
        super.message();//will invoke parent class message() method
    }
}



public class TestSuper {
    public static void main(String[] args) {
        Child s=new Child("Parent", "Child");
        s.show();
        s.display();
    }
}