package CT3;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee {

    String employeeName;
    int employeeId;
    double salary;


    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }


    public static void main(String[] args) {

        ArrayList<Employee> Data = new ArrayList<Employee>();

        Employee A = new Employee("Shah Newaz", 01, 35000);
        Employee B = new Employee("Esha", 05, 25000);
        Employee C = new Employee("Orchi", 01, 55000);


        Data.add(A);
        Data.add(B);
        Data.add(C);


        //descending order

        Data.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                if (o1.salary > o2.salary) return -1;
                if (o1.salary < o2.salary) return 1;
                return 0;
            }
        });

        for (Employee v : Data) {

            System.out.println("ID: " + v.employeeId + "\n"
                             +"Name: " + v.employeeName + "\n"
                   + "Salary: " + v.salary + "\n"
            );


        }


    }


}
