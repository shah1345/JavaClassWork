package Assignment;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class Address {
    String Name;
    String Phone;
    String Address;


    public Address(String Name, String Phone, String address) {


        this.Name = Name;
        this.Phone = Phone;
        this.Address = address;

    }

}


public class AddressBook {


    private static Address[] address = new Address[100];
    private static int Records = 0;


    public static void main(String[] args) {


        FinChoice();


    }


    public static void FinChoice() {


        System.out.println("Choise Your Option\n " +
                "\t 1 .Create New Record,\n \t 2 .update record,\n \t 3 .delete record"
        );


        Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();


        switch (nbr) {


            case 1:

                Account_Create();

                break;


            case 2:


                UpdateAddress();

                break;
            case 3:

                DeleteAddress();

                break;

            default:
                break;


        }


    }

    static void Account_Create() {

        System.out.println("Total New Record? ");


        Scanner scanner = new Scanner(System.in);

        int recourd_N = scanner.nextInt();


        for (int i = Records, j = 0; i < Records + recourd_N; i++, j++) {

            System.out.println("Your " + (j + 1) + " No Address");

            Scanner SC = new Scanner(System.in);

            System.out.println("Enter Name: ");

            String nam = SC.nextLine();

            System.out.println("Enter Phone: ");
            String phn = SC.nextLine();
            System.out.println("Enter Address: ");
            String addr = SC.nextLine();

            address[i] = new Address(nam, phn, addr);

        }


        try {


            FileWriter fw = new FileWriter("src/CT3OOP/file.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Spain\n");
            bw.newLine();
            bw.close();

            System.out.println("Working2");



        } catch (IOException e) {


            e.printStackTrace();
        }









        Records += recourd_N;

        FinChoice();

    }


    static void UpdateAddress() {

        System.out.println("Address list");


        for (int i = 0; i < address.length; i++) {

            if (address[i] != null) {

                System.out.println("ID: " + i +
                        "   Name : " + address[i].Name + "\t"
                        + "Phone : " + address[i].Phone + "\t"
                        + "Addres : " + address[i].Address + "\t"
                );

            }


        }

        System.out.println("Select the ID you want to Update ");

        Scanner SC1 = new Scanner(System.in);

        int ID = SC1.nextInt();

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Name: ");

        String nam = SC.nextLine();

        System.out.println("Enter Phone: ");
        String phn = SC.nextLine();
        System.out.println("Enter Address: ");
        String addr = SC.nextLine();

        address[ID] = new Address(nam, phn, addr);

        System.out.println("Update Successful");

        FinChoice();


    }

    static void DeleteAddress() {

        System.out.println("Address list");


        for (int i = 0; i < address.length; i++) {

            if (address[i] != null) {

                System.out.println("ID: " + i +
                        "   Name : " + address[i].Name + "\t"
                        + "Phone : " + address[i].Phone + "\t"
                        + "Addres : " + address[i].Address + "\t"
                );

            }


        }

        System.out.println("Select the ID You want to Delete ");

        Scanner SC = new Scanner(System.in);

        int ID = SC.nextInt();


        if (address[ID] == null) {

        }


        for (int i = ID; i < address.length - 1; i++) {
            address[i] = address[i + 1];
        }

        Address[] Clone = new Address[address.length - 1];

        for (int i = 0; i < address.length - 1; i++) {
            Clone[i] = address[i];
        }

        address = new Address[Clone.length];

        for (int i = 0; i < Clone.length; i++) {
            address[i] = Clone[i];
        }

        System.out.println("Delete Successful");

        FinChoice();


    }


}
