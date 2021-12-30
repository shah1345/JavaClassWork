import java.util.Scanner;

public class StudentArrayTest {
    public static void main(String args[]){
        StudentArray array[]= new StudentArray[3];
        //array[0]= new StudentArray("Md", "011", 3.47);
        //array[1]= new StudentArray("MD", "222", 3.25);
        //array[2]= new StudentArray("MKJ", "333", 3.03);
        Scanner input= new Scanner(System.in);
           /*String na = input.nextLine();
           String idd = input.next();
           double cg = input.nextDouble();
           array[0] = new StudentArray(na, idd, cg);

        */
        for(int i=0; i<array.length; i++) {
            String name = input.nextLine();
            String id = input.next();
            double cgpa = input.nextDouble();
            array[i] = new StudentArray(name, id, cgpa);
        }
        // array[0].displayInformation();
        for(int i=0; i<array.length; i++){
            array[i].displayInformation();
        }
    }
}