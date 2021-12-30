package CT;


 class Animal {


    Animal() {

        System.out.println("Animal created");
    }

    void eat() {
        System.out.println("Animal eats");

    }

    void fly() {
        System.out.println("Animal fly");

    }

}




     class Bird extends Animal {

        Bird(){

            System.out.println("Bird created");

        }

        void fly() {
            System.out.println("Bird fly");

        }

    public static void main (String[] args){

Animal a= new Bird();
a.fly();
a.eat();


    }


}
