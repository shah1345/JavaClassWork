import java.io.IOException;

class Student {
    public static String name;
    public static String id;
    public static double CGPA;
    public Student(String name, String id, double CGPA){
        this.name= name;
        this.id= id;
        this.CGPA= CGPA;
    }


    public static class ttttttttttttt {
        public static void main(String []args) throws IOException {

            displayInformation();


        }
    }




    public static void displayInformation(){
        System.out.println("Name: "+ name);
        System.out.println("Student ID: "+id);
        System.out.println("CGPA: "+CGPA);
    }
}