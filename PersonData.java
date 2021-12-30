import java.io.*;
import java.util.Scanner;






public class Balance implements Comparable<Balance> {


    public String getStudentName() { return studentName; }

    @Override

    public int compareTo(Balance other) {
        String name1 = this.getStudentName();
        String name2 = other.getStudentName();
        return name1.compareTo(name2);
    }
}








class DAta
{
    private String name;
    private String AccountID;
    private double balance;





    DAta(String name,String AccountID, int balance){
       this.name= name;
       this.AccountID= AccountID;
       this.balance= balance;



    }




    public double getsalary() {
        return balance;
    }

    public void setsalary(double balance) {
        this.balance = balance;
    }

    public String getname() {
        return name;
    }



    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }
}

public class PersonData {
    public static void main(String []args) throws IOException {
        int nStudent = 0;


        double balance;

        String name;
        String Accountid;
        DAta [] userdataArray = new DAta [0];
        try {
            File Object = new File("input.txt");
            Scanner Reader = new Scanner(Object);

            if(Reader.hasNextLine())
            {
                nStudent = Reader.nextInt();
                String data = Reader.nextLine();
            }

            userdataArray = new DAta [nStudent];

            for (int i = 0; Reader.hasNextLine(); i++)
            {
                if(nStudent<= i )
                {
                    break;
                }
                String data = Reader.nextLine();


                String[] in = data.split(" ");
                name = in[0];
                Accountid = in[1];
                balance = Integer.parseInt(in[2]);


                userdataArray[i] =  new DAta (name,Accountid, (int) balance);
            }
            Reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        catch (NumberFormatException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Writer Out,Out2;
        Out = new BufferedWriter(new FileWriter("first.txt"));
        Out2 = new BufferedWriter(new FileWriter("secound.txt"));
        for(int i = 0; i<nStudent; i++)
        {

            name = userdataArray[i].getname();
            balance = userdataArray[i].getsalary();
            Accountid = userdataArray[i].getAccountID();



            if(balance>10000) {

                System.out.println(name + " " + Accountid + " " + balance);

                String str2 = name + " " + Accountid + " " + balance + "\n";

                Out.append(str2);
            }






        }
        Out.close();
        Out2.close();
    }
}
