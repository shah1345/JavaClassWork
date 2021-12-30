import java.io.*;
import java.util.Scanner;



public class Raisa2 {
    public static void main(String[] args) throws IOException {




        try {
           File Object = new File("in.txt");
            Scanner Reader = new Scanner(Object);


            for (int j = 0; j<2; j++) {

                String data = Reader.nextLine();
            }


           while( Reader.hasNextLine()) {

                String data = Reader.nextLine();


                Writer Out;
                Out = new BufferedWriter(new FileWriter("out.txt",true));


                String str = data + "\n";
                Out.append(str);
                Out.close();


            }
            Reader.close();

        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }


    }





