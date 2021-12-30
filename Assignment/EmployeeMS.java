package Assignment;
/*

import java.util.Scanner;

class Employee {
    private String Name;
    private String phone;
    private double Salary;

    public Employee(String Name, String phone, double Salary) {
        this.Name = Name;
        this.phone = phone;
        this.Salary = Salary;

    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return Salary;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPhone(String Phone) {
        this.phone = Phone;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void printall() {
        System.out.println("Name = " + Name);
        System.out.println("Phone No = " + phone);
        System.out.println("Salary = " + Salary);

    }
}

class Salaried extends Employee {

    public Salaried(String Name, String phone, double Salary) {
        super(Name, phone, Salary);

    }

}

class HourlySalaried extends Employee {
    private int hours;

    public HourlySalaried(String Name, String phone, double Salary, int hours) {
        super(Name, phone, Salary);
        setTime(hours);

    }

    public void setTime(int hours) {

        this.hours = hours;
    }

    public int getTime() {
        return hours;
    }


    public double grtSalary () {
       return getSalary() * hours;
    }


    public void printall() {
        super.printall();
        System.out.println( "Hourly Salary: " + grtSalary ());
    }

}

class Commissioned extends Employee {
    private double CommissionedSalary;
    private int productSold;

    public Commissioned(String Name, String phone, double Salary, int propductSold) {
        super(Name, phone, Salary);

        this.productSold=propductSold;
        setCommissionedSalary(Salary);
        setSoldProduct(propductSold);

    }

    public int getSoldProduct() {

        return productSold;
    }

    public void setSoldProduct(int productSold) {
        this.productSold = productSold;
    }

    public double getCommissionedSalary() {
        return (getSalary() + getSoldProduct());
    }

    public void setCommissionedSalary(double CommissionedSalary) {
        this.CommissionedSalary = CommissionedSalary + productSold;
    }

    public void printall() {
        super.printall();
        System.out.println("Commissioned Salary : " + CommissionedSalary +productSold );
    }
}

public class EmployeeMS {
    public static void main(String[] args) {

       // Scanner input = new Scanner(System.in);
        // Name = input.nextLine();
        // phone = input.nextLine();
        // Salary = input.nextDouble();
        // hours = input.nextInt();
        // productSold = input.nextInt();

        HourlySalaried h = new HourlySalaried("Nameon", "01984197", 100, 8);

        Commissioned c = new Commissioned("name2", "01984468197", 8000, 20);


    }

}

*/