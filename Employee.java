import java.io.*;
import java.util.Scanner;


class Employe {


    public int ID;
    public String name;
    public double salary;


    public Employe(int a, String b, double c) {
        this.ID = a;
        this.name = b;
        this.salary = c;

    }


}

public class Employee {
    public static void main(String[] args) throws IOException {


        String name;

        int ID;
        double salary;


        Employe[] employe = new Employe[5];

        try {
            File Object = new File("C:\\Users\\shahr\\IdeaProjects\\Dina\\employeeDirectory");
            Scanner Reader = new Scanner(Object);

            if (Reader.hasNextLine()) {
                // nStudent = Reader.nextInt();
                String data = Reader.nextLine();
            }
            employe = new Employe[5];
            // student = new Student[5];

            for (int i = 0; Reader.hasNextLine(); i++) {
                if (5 <= i) {
                    break;
                }
                String data = Reader.nextLine();


                String[] in = data.split(" ");
                ID = Integer.parseInt(in[0]);
                name = in[1];
                salary = Double.parseDouble(in[2]);


                employe[i] = new Employe(ID, name, salary);
                //student[i] =  new Student(id, name, physicsMarks, chemistryMarks, mathMarks);
            }
            Reader.close();

        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Writer Out;
        Out = new BufferedWriter(new FileWriter("output.txt"));

        double maxSalary = 0;
        int newid = 0;
        String newname = null;


        for (int i = 0; i < 4; i++) {


            if (maxSalary < employe[i].salary) {
                maxSalary = employe[i].salary;
                newid = employe[i].ID;
                newname = employe[i].name;

            }


        }
        String str = "Maximum salary ID : " + newid + " Name: " + newname + " Salary: " + maxSalary + "\n";
        Out.append(str);
        Out.close();
    }


}



