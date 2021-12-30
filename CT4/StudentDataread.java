package CT4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


class StudentD {
    String Name;
    int ID;
    double CGPA;

    public StudentD(String name, int ID, double CGPA) {
        Name = name;
        this.ID = ID;
        this.CGPA = CGPA;
    }

}


public class StudentDataread {

    public static void main(String[] args) {


        int MaxID = 0, MinID = 0;
        double MAxCGPA = 0, Sum = 0;
        double MinCGPA = 100;
        String MaxName = null, MinName = null;


        String Data = "";
        StudentD StudentDData[] = new StudentD[11];

        try {

            File Object = new File("src/CT4/input.txt");
            Scanner Reader = new Scanner(Object);
            for (int i = 0; Reader.hasNextLine(); i++) {

                StudentDData[i] = new StudentD(Reader.next(), Reader.nextInt(), Reader.nextDouble());


            }

            for (int i = 0; i < 5; i++) {

                if (MAxCGPA < StudentDData[i].CGPA) {

                    MAxCGPA = StudentDData[i].CGPA;
                    MaxName = StudentDData[i].Name;
                    MaxID = StudentDData[i].ID;


                }
                if (MinCGPA > StudentDData[i].CGPA) {

                    MinCGPA = StudentDData[i].CGPA;
                    MinName = StudentDData[i].Name;
                    MinID = StudentDData[i].ID;


                }
            }

            for (int i = StudentDData.length-5; i < StudentDData.length; i++) {

                Sum += StudentDData[i].CGPA;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        try {


            File file = new File("src/CT4/output.txt");

            PrintWriter out = new PrintWriter(file);



            Data += "Min cgpa of the first 5 students: " + MinName + ", " + MinID + ", " + MinCGPA;
            Data += "\nMax cgpa of the first 5 students: " + MaxName + ", " + MaxID + ", " + MAxCGPA;
            Data += "\nAvg cgpa of the last 5 students: " + Sum / 5;



            out.println(Data);

            out.close();




        } catch (IOException e) {


            e.printStackTrace();
        }


    }


}


/* input.txt

Raihan 223 1.57
Hasan 431 3.39
Rakib 255 3.87
Karim 254 3.21
Esha 545 4.00
shah 100 3.90
mim 56 3.50
ono 548 4.1
Rar 598 2.1
omin 900 1.0
omin 900 1.0


 */


/* Output.txt


Min cgpa of the first 5 students: Raihan, 223, 1.57
Max cgpa of the first 5 students: Esha, 545, 4.0
Avg cgpa of the last 5 students: 2.34




 */






