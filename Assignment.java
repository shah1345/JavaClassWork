
class Course {
    String courseName;
    String courseTeacher;
    int courseCredits;
    int daysPerWeek;

    public Course(String CourseName, String CourseTeacher,  int CourseCredits,  int DaysPerWeek) {

        courseName=CourseName;
        courseTeacher=CourseTeacher;
        courseCredits=CourseCredits;
        daysPerWeek=DaysPerWeek;


    }



    void updateCourseCredits(int newCredits) {

        courseCredits = newCredits;


    }


    public void Print() {

     System.out.println("current Course Credits: " + courseCredits);

    }




}



public class Assignment {

    public static void main(String[] args) {

        Course Mathematics = new Course("Math 101","Maria",3,3);
        Course Chemistry = new Course("Chem 101","Jack",3,3);

        Chemistry.updateCourseCredits(4);
        Mathematics.Print();
        Chemistry.Print();

    }

}
