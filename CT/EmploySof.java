package CT;

class Employee {

String Name;
float Salary;

    public Employee(String name, float salary) {
        Name = name;
        Salary = salary;
    }


    void printSalary(){

        System.out.println("Name: "+ Name);


    }
}

class PlatinumEmployee extends Employee{


    public PlatinumEmployee(String name, float salary) {
        super(name, salary);
    }


    @Override
    void printSalary() {
        super.printSalary();
        System.out.println("bonus amount: " + (Salary*0.15)

                        +"\n Total Salary: " + (Salary + Salary*0.15)

        );
    }


}

class SilverEmployee extends Employee{


    public SilverEmployee(String name, float salary) {
        super(name, salary);
    }

    @Override
    void printSalary() {
        super.printSalary();
        System.out.println( "Name: "+ Name
                +"\n bonus amount: " + (Salary*0.07)

                +"\n Total Salary: " + (Salary + Salary*0.07)

        );
    }
}



public class EmploySof{
    public static void main(String[] args){


        PlatinumEmployee P1 = new PlatinumEmployee("Anika Tabassum Orchi",70000);
        SilverEmployee S2 = new SilverEmployee("Shah Newaz",50000);
P1.printSalary();
        S2.printSalary();

    }




}