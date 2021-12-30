public class Student {

    String name ;
    double cgpa;

    Student(String name, double cgpa){
        this.name=name;
        this.cgpa=cgpa;

    }

   void printCgpa(){

       System.out.println(name + "'s cgpa is " + cgpa);


    }


    public static void main(String[] args) {

        Student S1= new Student("Ahnaf",3.84);

S1.printCgpa();
int array[][]= new int[3][2];

        System.out.println(array[0].length);




    }

    }
