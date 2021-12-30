package FinalPrep;

import java.io.*;
import java.util.ArrayList;




class Datafile{

    int id;
    int amount;
    Datafile ( int id, int amount){
        this.id = id;
        this.amount = amount;
    }
}

public class datastoreimp {

    public static void main(String[] args) {


        ArrayList<Datafile> fin = new ArrayList<>();
        try {

            FileReader fr = new FileReader("input.txt");
            BufferedReader reader = new BufferedReader(fr);
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                String[] parts = line.split("-");
                Datafile f = new Datafile(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));
                fin.add(f);
            }

            PrintWriter p = new PrintWriter(new File("output.txt"));
            for (Datafile fl:fin){
                if (fl.amount>999){
                    p.println(fl.id+"-"+fl.amount);

                }
                else if (fl.id>999){
                    p.println(fl.id+"-"+fl.amount);
                }
                else break;
            }
            p.close();
            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }




    }



