import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {



    public static void main(String args[]){
        ArrayList<Studentlist> arraylist = new ArrayList<>();
        arraylist.add(new Studentlist(223, "Chaitanya", 26));
        arraylist.add(new Studentlist(245, "Rahul", 24));
        arraylist.add(new Studentlist(209, "Ajeet", 32));

        Collections.sort(arraylist);

        for(Studentlist str: arraylist){
            System.out.println(str);
        }
    }



}




 class Studentlist implements Comparable {
    private String studentname;
    private int rollno;
    private int studentage;

    public Studentlist(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }





     public int getStudentage() {
         return studentage;
     }
     public void setStudentage(int studentage) {
         this.studentage = studentage;
     }

     //getter and setter methods same as the above example
/*
    @Override
    public int compareTo(Studentlist comparestu) {
        int compareage=((Studentlist)comparestu).getStudentage();
       
        return this.studentage-compareage;

      
        
    }*/

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

     @Override
     public int compareTo(Object o) {

         int compareage=((Studentlist)o).getStudentage();

         return this.studentage-compareage;
        
     }
 }


