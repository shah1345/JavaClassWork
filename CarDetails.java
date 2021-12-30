import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class CArData
{



    public String companyname;
    public int price;
    public int year;
    public int weight;





    public CArData(String a, int b,int c,int d) {
        this.companyname=a;
        this.price=b;
        this.year= c;
        this.weight= d;

    }



}

public class CarDetails {
    public static void main(String[] args) throws IOException {


        String name;

        int price;
        int year;
        int weight;

        ArrayList<CArData> Ai = new ArrayList<CArData>();

        Iterator itr = Ai.iterator();


        CArData[] CArlist = new CArData[0];

        try {
            File Object = new File("C:\\Users\\shahr\\IdeaProjects\\newwwwwwwwwwwwaaaaaaaa\\CarData.txt");
            Scanner Reader = new Scanner(Object);

            if (Reader.hasNextLine()) {
                // nStudent = Reader.nextInt();
                String data = Reader.nextLine();
            }
            CArlist = new CArData[201];
            // student = new Student[5];

            for (int i = 0; Reader.hasNextLine(); i++) {
              /*  if (5 <= i) {
                    break;
                } */
                String data = Reader.nextLine();

                System.out.println(data);


                String[] in = data.split("_");


                //company name, price in usd, year and weight of the car in KG.
/*
                int l = in.length;

                name = in[0];
                price = Integer.parseInt(in[1]);
                year = Integer.parseInt(in[2]);
                weight = Integer.parseInt(in[3]);


                CArlist[i] = new CArData(name, price, year, weight);

                */

            }


            Reader.close();

        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Writer Out;
        Out = new BufferedWriter(new FileWriter("output.txt"));


        {


            int mazdamaxprice = 0;

            int subarumaxprice = 0;


            int mazdaLowprice = 90344;
            int subaruLowprice = 90344;


            for (int i = 0; i < 200; i++) {


                if (CArlist[i].companyname.equals("mazda")) {

                    if (mazdamaxprice < CArlist[i].price) {

                        mazdamaxprice = CArlist[i].price;
                    }


                    if (mazdaLowprice > CArlist[i].price) {

                        mazdaLowprice = CArlist[i].price;
                    }


                }


                if (CArlist[i].companyname.equals("subaru")) {

                    if (subarumaxprice < CArlist[i].price) {

                        subarumaxprice = CArlist[i].price;
                    }


                    if (subaruLowprice > CArlist[i].price) {

                        subaruLowprice = CArlist[i].price;
                    }


                }


            }


            String str = "Min price of mazda cars: " + mazdaLowprice + "\n" +
                    "Max price of mazda cars: " + mazdamaxprice + "\n" +
                    "Min price of subaru cars: " + subaruLowprice + "\n" +
                    "Max price of subaru cars: " + subarumaxprice + "\n";

            Out.append(str);
            Out.close();
        }


    }

}



/*


Output

Min price of mazda cars: 5195
Max price of mazda cars: 18344
Min price of subaru cars: 5118
Max price of subaru cars: 11694






 */