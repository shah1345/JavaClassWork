import java.io.*;
import java.util.Scanner;



class DataUser
{



    public String name;
    public int  age;
    public String district;



    public DataUser(String a, int b, String c) {

        this.name=a;
        this.age=b;
        this.district= c;

    }



}

public class vVctim {
    public static void main(String[] args) throws IOException {


         String name;
         int  age;
         String district;



        DataUser[] Udata = new DataUser[6];




        try {
            File Object = new File("C:\\Users\\shahr\\IdeaProjects\\Dina\\victims.txt");
            Scanner Reader = new Scanner(Object);






            for (int i = 0; Reader.hasNextLine(); i++) {

                String data = Reader.nextLine();

                System.out.println(data);
                String[] in = data.split("-");

                name = in[0];
                age = Integer.parseInt(in[1]);
                district = in[2];


                Udata[i] =  new DataUser(name,age,district);


            }
            Reader.close();

        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Writer Out;
        Out = new BufferedWriter(new FileWriter("output.txt"));





        int Barishal=0,Dhaka=0, Rajshahi=0;



        for (int i = 0; i < Udata.length; i++) {


            if( Udata[i].district.equals("Barishal")){


                Barishal++;

            } else if( Udata[i].district.equals("Dhaka")){


                Dhaka++;

            } else if( Udata[i].district.equals("Rajshahi")){


                Rajshahi++;

            }



        }
        String str;
        if(Barishal>Dhaka && Barishal>Rajshahi){

             str = "Barishal-" + Barishal + "\n";

        } else if (Dhaka>Barishal && Dhaka>Rajshahi){

            str = "Dhaka-" + Dhaka + "\n";

        } else  str = "Rajshahi-" + Rajshahi + "\n";



        Out.append(str);
        Out.close();
    }


}



