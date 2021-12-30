import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class MaxNumbers {
    public static void main(String[] args) throws IOException {



        try {
            File Object = new File("C:\\Users\\shahr\\IdeaProjects\\student\\numbers.txt");
            Scanner Reader = new Scanner(Object);





            for (int i = 0; Reader.hasNextLine(); i++)
            {

                String data = Reader.nextLine();


                String[] in = data.split(",");

                int max =0;
                for (int j = 0; j<in.length; j++)
                {
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