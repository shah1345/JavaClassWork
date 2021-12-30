
abstract class Car {

    public String company;
    String model;

    String color;
    int maxSpeed;


    public void accelerate() {


    }


    public void brake() {


    }


    class Audi extends Car {

        Car MyCar = new Car() {
            @Override
            public void accelerate() {
                super.accelerate();
            }
        } ;

        Car M2 = new Car() {
            @Override
            public void brake() {
                super.brake();
            }
        };



    }

}