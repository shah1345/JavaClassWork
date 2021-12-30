import java.io.*;
import java.util.Scanner;





public class maxnbr {
    public static void main(String[] args) {




        try {
            File Object = new File("C:\\Users\\shahr\\IdeaProjects\\Dina\\number.txt");
            Scanner Reader = new Scanner(Object);





            for (int i = 0; Reader.hasNextLine(); i++) {


                String data = Reader.nextLine();


                String[] in = data.split(",");
                //company name, price in usd, year and weight of the car in KG.

                int max =0;

                for(int j=0;j<in.length;j++){

                    if(max<Integer.parseInt(in[j])){

                        max=Integer.parseInt(in[j]);

                    }



                }

                System.out.println(max);







            }



            Reader.close();

        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }


}



