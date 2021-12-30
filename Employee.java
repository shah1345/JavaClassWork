public class Employee {
    public String Name;
    public float Salary;


    void platinumPrintSalary() {
        System.out.println("Name: " + Name + "  Bonus amount: " + (Salary * 15) / 100+" Total Salary: "+(((Salary * 15) / 100)+Salary));
    }
    void silverPrintSalary()
    {
        System.out.println("Name: " + Name + "  Bonus amount: " + (Salary * 7) / 100+" Total Salary: "+(((Salary * 7) / 100)+Salary));
    }


}
class PlatinumEmployee {
    public static void main(String[] args) {
        Employee platinum = new Employee();
        platinum.Name = "Esha";
        platinum.Salary = 605100;
        platinum.platinumPrintSalary();

    }
}

class SilverEmployee {
    public static void main(String[] args) {
        Employee silver = new Employee();
        silver.Name = "Shah";
        silver.Salary = 185090;
        silver.silverPrintSalary();
    }

}

