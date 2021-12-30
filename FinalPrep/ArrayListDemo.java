package FinalPrep;


import java.util.ArrayList;
import java.util.Comparator;

class Student {

    String name;
    double height;

    public Student(String name, double height) {
        this.name = name;
        this.height = height;
    }
}




public class ArrayListDemo {





    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("Shah",5.6));
        list.add(new Student("Esha",5.7));
        list.add(new Student("onik",5.5));
        list.add(new Student("orchi",5.0));
        list.add(new Student("pritom",5.4));

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                if (o1.height > o2.height) return -1;
                if (o1.height < o2.height) return 1;
                return 0;
            }
        });

        for (Student v : list) {

            System.out.println("Name: " + v.name + "\n"
                    + "Height: " + v.height + "\n"
            );


        }




    }


}
