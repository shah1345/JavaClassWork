import java.io.*;
import java.util.Scanner;



class Student
{


    public int ID;
    public String name;
    public double salary;


    public Student(int a, String b, double c) {
        this.ID=a;
        this.name=b;
        this.salary= c;

    }



}

public class Studentp2 {
    public static void main(String[] args) throws IOException {


        String name;

        int ID;
        double salary;


        Student[] student = new Student[0];

        try {
            File Object = new File("C:\\Users\\shahr\\IdeaProjects\\Dina\\employeeDirectory");
            Scanner Reader = new Scanner(Object);

            if (Reader.hasNextLine()) {
                // nStudent = Reader.nextInt();
                String data = Reader.nextLine();
            }
            student = new Student[5];
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


                student[i] = new Student(ID, name, salary);
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



           if(maxSalary<student[i].salary){
                maxSalary=student[i].salary;
                newid=student[i].ID;
                newname=student[i].name;

            }




        }
        String str = "Maximum salary ID : " + newid + " Name: " + newname + " Salary: " + maxSalary + "\n";
        Out.append(str);
        Out.close();
    }


}



