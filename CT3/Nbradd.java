package CT3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Nbradd {


    public static void main(String[] args) {
        try {
            File Object = new File("src/CT3/input.txt");
            Scanner Reader = new Scanner(Object);

            for(int var3 = 0; Reader.hasNextLine(); ++var3) {
                String data = Reader.nextLine();
                String[] in = data.split(",");
                int Sum = 0;

                for(int j = 0; j < in.length; ++j) {
                    Sum+=Integer.parseInt(in[j]);
                }

                System.out.println(Sum);
            }

            Reader.close();
        } catch (NumberFormatException | FileNotFoundException var8) {
            System.out.println("An error occurred.");
            var8.printStackTrace();
        }

    }
}
