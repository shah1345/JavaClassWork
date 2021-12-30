package CT3;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentData {


   public static ArrayList<String>  data = new ArrayList<String>();



    public static void main(String[] args) {

        try {
            File Object = new File("Input.txt");
            Scanner Reader = new Scanner(Object);
            for (int i = 0; Reader.hasNextLine(); i++) {

                data.add(Reader.nextLine()) ;


                }
            } catch (FileNotFoundException e) {
            e.printStackTrace();


        }










        data.sort(new Comparator<String>() {


            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);

            }
        });


        for (String A : data){

            System.out.println("Name: " + A );

            try {
                FileWriter fw = new FileWriter("Output.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(A);
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }







    }



}
