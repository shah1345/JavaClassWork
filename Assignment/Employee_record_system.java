package Assignment;


/*
3. Create an Employee record system for a company. The application will help the company to view record of a
specific employee, update his info. The Company has 3 types of employee (Salaried, HourlySalaried,
Commissioned), your application must handle all types of employee.
Hints: Use Inheritance and array of objects. [12]
Bonus: Use subclass polymorphism (5 bonus marks)
Note:
1. Salaried Employee: Salary given at the end of each month.
2. HourlySalaried Employee: Salary calculated as: Salary per hour * No of hours worked.
3. Commissoned Employee: Has a base salary + commission for each product sold.

 */

import java.util.Scanner;

class Employee_record {

    private String Name;
    private String Phone;
    private double Salary;

    public Employee_record(String name, String phone, double salary) {
        Name = name;
        Phone = phone;
        Salary = salary;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}

class Salaried extends Employee_record {


    public Salaried(String name, String phone, double salary) {
        super(name, phone, salary);
    }

    public void Printinfo() {


        System.out.println("Salaried Employee: \n" +
                "Name : " + super.getName() + "\n" +
                "Phone : " + super.getPhone() + "\n" +
                "Salary : " + super.getSalary() + "\n"
        );


    }


}


class HourlySalaried extends Employee_record {

    int hoursWork;


    public HourlySalaried(String name, String phone, double salary, int Hour) {
        super(name, phone, salary);
        this.hoursWork = Hour;
        setHoursWorkSalary();

    }

    int getHoursWorkSalary() {
        return hoursWork;
    }

    void setHoursWorkSalary() {
        super.setSalary(hoursWork * super.getSalary());
    }

    public void Printinfo() {


        System.out.println("Hourly Employee: \n" +
                "Name : " + super.getName() + "\n" +
                "Phone : " + super.getPhone() + "\n" +
                "Salary : " + super.getSalary() + "\n"
        );


    }


}


class Commissioned extends Employee_record {

    int product_sold;
    double Commission;


    public Commissioned(String name, String phone, double salary, int sold, double commission) {
        super(name, phone, salary);
        this.product_sold = sold;
        this.Commission = commission;
        setProduct_soldCommissioned();

    }


    int getProduct_soldCommissioned() {
        return product_sold;
    }

    void setProduct_soldCommissioned() {

        super.setSalary(super.getSalary() + product_sold * Commission);


    }


    public void Printinfo() {


        System.out.println("Commissioned Employee: \n" +
                "Name : " + super.getName() + "\n" +
                "Phone : " + super.getPhone() + "\n" +
                "Salary : " + super.getSalary() + "\n"
        );


    }


}


public class Employee_record_system {

    private static Salaried salaried[] = new Salaried[100];
    private static HourlySalaried hourlySalaried[] = new HourlySalaried[100];
    private static Commissioned commissioned[] = new Commissioned[100];


    public static void main(String[] args) {


        salaried[0] = new Salaried("Shah Newaz Aziz", "01774307000", 63000);
        salaried[1] = new Salaried("Roktim", "01774307000", 3000);
        salaried[2] = new Salaried("ONO", "01774307000", 5000);

        hourlySalaried[0] = new HourlySalaried("Orchi", "01774307000", 6300, 8);
        hourlySalaried[1] = new HourlySalaried("Roktim", "01774465694", 30000, 6);
        hourlySalaried[2] = new HourlySalaried("Ronggon", "01775999542", 23000, 4);


        commissioned[0] = new Commissioned("ONO", "01774307000", 10000, 25, 590);
        commissioned[1] = new Commissioned("Roktim", "01774465694", 5000, 50, 520);
        commissioned[2] = new Commissioned("Ronggon", "01775999542", 10000, 20, 220);


        Select();
    }

    public static void ShowRecord(int type) {


        switch (type) {

            case 1:
                System.out.println("Salaried Employee Information: \n");

                for (int i = 0; i < salaried.length; i++) {


                    if (salaried[i] != null) {


                        System.out.println("Employee ID: " + i +
                                "\tName : " + salaried[i].getName() + "\t" +
                                "Phone : " + salaried[i].getPhone() + "\t" +
                                "Salary : " + salaried[i].getSalary() + "\t"
                        );


                    }

                }


                break;
            case 2:

                for (int i = 0; i < hourlySalaried.length; i++) {

                    if (hourlySalaried[i] != null) {


                        System.out.println("Employee ID: " + i +
                                "\tName : " + salaried[i].getName() + "\t" +
                                "Phone : " + salaried[i].getPhone() + "\t" +
                                "Salary : " + salaried[i].getSalary() + "\t"
                        );


                    }


                }


                break;

            case 3:

                for (int i = 0; i < commissioned.length; i++) {

                    if (commissioned[i] != null) {


                        System.out.println("Employee ID: " + i +
                                "\tName : " + salaried[i].getName() + "\t" +
                                "Phone : " + salaried[i].getPhone() + "\t" +
                                "Salary : " + salaried[i].getSalary() + "\t"
                        );


                    }


                }


                break;


        }


    }


    public static void UpdateRecord() {


        System.out.println("Welcome To SHAH X Employee Database" +
                "\n 1. Salaried Employee" +
                "\n 2. Hourly Salaried Employee" +
                "\n 3. Commissioned Employee");
        System.out.print("\n Select Your Choice : ");


        Scanner Sc = new Scanner(System.in);
        Scanner Sc2 = new Scanner(System.in);

        int Selection = Sc.nextInt();


        String Name, Phone;
        double Bl, Commition;
        int hour, Sold, IDno;
        switch (Selection) {

            case 1:

                ShowRecord(1);

                System.out.print("Select Employed ID to Updated Data: ");
                IDno = Sc.nextInt();

                System.out.print("Name: ");
                Name = Sc2.nextLine();
                System.out.print("Phone: ");
                Phone = Sc2.nextLine();
                System.out.print("Salary: ");
                Bl = Sc2.nextDouble();

                salaried[IDno] = new Salaried(Name, Phone, Bl);

                System.out.println("Salaried Employed Data Updated!");

                salaried[IDno].Printinfo();
                Select();

                break;


            case 2:

                ShowRecord(2);

                System.out.print("Select Employed ID to Updated Data: ");
                IDno = Sc.nextInt();

                System.out.print("Name: ");
                Name = Sc2.nextLine();
                System.out.print("Phone: ");
                Phone = Sc2.nextLine();
                System.out.print("Per Hour Salary: ");
                Bl = Sc2.nextDouble();
                System.out.print("Total Working Hour: ");
                hour = Sc2.nextInt();

                hourlySalaried[IDno] = new HourlySalaried(Name, Phone, Bl, hour);

                System.out.println("Hourly Salaried Employed Data Updated!");

                hourlySalaried[IDno].Printinfo();
                Select();

                break;

            case 3:

                ShowRecord(3);

                System.out.print("Select Employed ID to Updated Data: ");
                IDno = Sc.nextInt();

                System.out.print("Name: ");
                Name = Sc2.nextLine();
                System.out.print("Phone: ");
                Phone = Sc2.nextLine();
                System.out.print("Salary: ");
                Bl = Sc2.nextDouble();
                System.out.print("Total Sold: ");
                Sold = Sc2.nextInt();
                System.out.print("Commission for each product sold: ");
                Commition = Sc2.nextDouble();

                commissioned[IDno] = new Commissioned(Name, Phone, Bl, Sold, Commition);

                System.out.println("Commission Employed Data Updated!");
                commissioned[IDno].Printinfo();
                Select();

                break;

            default:
                break;


        }


    }


    public static void Select() {

        System.out.println("Welcome To SHAH X Employee Database" +
                "\n 1. View Record" +
                "\n 2. Update Record" +
                "\n 3. Exit");
        System.out.print("\n Select Your Choice : ");


        Scanner Sc = new Scanner(System.in);
        Scanner Sc2 = new Scanner(System.in);

        int Selection = Sc.nextInt();


        switch (Selection) {

            case 1:

                System.out.println("Welcome To SHAH X Employee Database" +
                        "\n 1. Salaried Employee" +
                        "\n 2. Hourly Salaried Employee" +
                        "\n 3. Commissioned Employee");
                System.out.print("\n Select Your Choice : ");

                int IDType = Sc2.nextInt();
                ShowRecord(IDType);
                Select();

                break;

            case 2:

                UpdateRecord();

                break;

            case 3:

                break;

            default:
                break;


        }


    }


}
