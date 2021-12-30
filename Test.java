import java.util.Scanner;

class Coursee{
    private String courseName;
    private double gpa;
    private double credit;
    public Coursee(String CourseName,double Gpa,double Credit){
        //Complete the constructor
        courseName=CourseName;
        gpa=Gpa;
       credit=Credit;


    }

}
class Studentt {
    private Course[] courses; //Array of course objects
    private String name;
    private int totalCourse;


    public  Studentt() {
        this(" ", 0);
    }


    public  Studentt(String Name, int TotalCourse) {
        //Complete this constructor


        name = Name;
        totalCourse = TotalCourse;

        //initialize courses array with new() and its size is totalCourse

        courses = new Course[totalCourse];

    }





    void addCourse(Course c, int index){
        //assign the Course c in the courses array on given index.
    }
}
public class Test {
    public static void main(String args[]){

        Studentt stu = new Studentt();


        Scanner data1 = new Scanner(System.in);




        // String input
        int counter = data1.nextInt();



        for (int i = 0; i < counter; i++) {
            System.out.println(i);


            String StudentName = data1.nextLine();
            String CoursesName = data1.nextLine();
            double CGP = data1.nextDouble();
            int Credit = data1.nextInt();



        }











        //Write code Here
        //Take n as input, n=total number of students.
        //for each student input students’ name, total course number and courseinfos ( see the doc)
        //print all student's info in reverse order.
    }
}