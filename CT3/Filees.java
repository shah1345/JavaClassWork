package CT3;
import java.io.File;

import java.io.PrintWriter;
import java.util.Scanner;





public class Filees {

    public static void main(String[] args){


String Data = null;


        try
        {

            File Object = new File("filename.txt");
            Scanner Reader = new Scanner(Object);
            if (Reader.hasNextLine()) {
                 Data = Reader.nextLine();
            }




        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



        try {


            File file = new File("filename2.txt");
          PrintWriter out = new PrintWriter(file);

            Data += "\n job Done!";

        //  Student st = new Student("Arif",1100,3.52);

          //  out.println("Name : "+ st.Name + " Id: " + st.ID + " CGPA: " + st.CGPA);
            out.println(Data);

            out.close();


        } catch (Exception e){


            e.printStackTrace();
        }



    }


}
