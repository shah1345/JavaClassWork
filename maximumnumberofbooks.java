import java.io.*;
import java.util.Scanner;






    class BookTupe
    {



        public String name;
        public int  NBr;




        public BookTupe(String a, int b) {

            this.name=a;
            this.NBr=b;


        }



    }

    public class maximumnumberofbooks {
        public static void main(String[] args) throws IOException {


            String name;
            int  NBr;




            BookTupe[] Udata = new BookTupe[2];




            try {
                File Object = new File("C:\\Users\\shahr\\IdeaProjects\\Dina\\bookData.txt");
                Scanner Reader = new Scanner(Object);






                for (int i = 0; Reader.hasNextLine(); i++) {

                    String data = Reader.nextLine();


                    String[] in = data.split("-");

                    name = in[0];
                    NBr = Integer.parseInt(in[1]);



                    Udata[i] =  new BookTupe(name,NBr);


                }
                Reader.close();

            } catch (FileNotFoundException | NumberFormatException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            Writer Out;
            Out = new BufferedWriter(new FileWriter("output.txt"));







            int maxBook=0;
            int storlocation = 0;

            for (int i = 0; i < Udata.length; i++) {


                if(maxBook<Udata[i].NBr){

                    maxBook=Udata[i].NBr;
                    storlocation=i;

                }





            }
            String str = Udata[storlocation].name + "-" + Udata[storlocation].NBr+ "\n";
            Out.append(str);
            Out.close();
        }


    }



