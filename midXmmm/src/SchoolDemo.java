class Student{

    public int id;
    public double cgpa;
    public String name;



    public Student(String name, float cgpa) {

        this.name=name;
        this.cgpa=cgpa;

    }
}



class School {

    Student[] students;



    School() {

        students = new Student[3];

    }


    void addStudent(int id, String name, float cgpa) {


        students[id] = new Student(name, cgpa);

    }

    void updateStudent(int id, float new_cgpa) {


        students[id].cgpa=new_cgpa;

    }

    void printStudentDetail(int id) {

        System.out.printf( "%s  %.1f \n",students[id].name ,students[id].cgpa);
    }


}

public class SchoolDemo {

    public static void main(String[] args) {
       School school = new School();
        school.addStudent(0,"Alice",3.5f);
        school.addStudent(1,"Bob",3.7f);
        school.addStudent(2,"trudy",3.2f);
        school.printStudentDetail(0);
        school.updateStudent(0,3.7f);
        school.printStudentDetail(0);



    }


}
