
class Car{


    String Model;
    int Speed;

    public Car(String model,int speed){

        this.Model = model;
        this.Speed = speed;

    }

     void increasesSpeed(){
         Speed = Speed + 2;
    }

    void increasesSpeedFast(){
        Speed = Speed + 10;
    }



    void decreasesSpeed(){
        Speed = Speed - 2;
    }

    void decreasesSpeedfast(){
        Speed = Speed -15;
    }
}


class test2ct {
    public static void main(String[] args) {
        Car car = new Car("Tyota",0);



        car.increasesSpeedFast();


        for (int i = 0; i <=5;i++)
        car.increasesSpeed();


        car.decreasesSpeed();

        car.increasesSpeedFast();  car.increasesSpeedFast();

        for (int i = 0; i <2;i++)
            car.decreasesSpeedfast();



        System.out.println(car.Speed);  // prints: 0



    }
}



