package Assignment;

/*
Create a Banking Application, where a user can create new account, deposit money, withdraw money and
check the balance.

 */

import java.util.Random;
import java.util.Scanner;


class UserData {

    private String UserName;
    private String AcountID;
    private String PhoneNumber;
    private double Balance;


    public UserData(String userName, String acountID, String phoneNumber, double balance) {
        UserName = userName;
        AcountID = acountID;
        PhoneNumber = phoneNumber;
        Balance = balance;
    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAcountID() {
        return AcountID;
    }

    public void setAcountID(String acountID) {
        AcountID = acountID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
}


public class BankingApplication {


    private static UserData Account[] = new UserData[100];

    private static int AClist = 0;


    public static void main(String[] args) throws Exception {

        Select();

    }


    public static void Select() {

        System.out.println("Welcome To SHAH X Banking" +
                "\n 1. Create Account" +
                "\n 2. Deposit Money" +
                "\n 3. Withdraw Money");
        System.out.print("\n Select Your Choice : ");


        Scanner Sc = new Scanner(System.in);

        int Selection = Sc.nextInt();


        switch (Selection) {

            case 1:
                CreateAC();

                break;

            case 2:

                deposit_money();

                break;

            case 3:

                withdraw_money();

                break;

            default:
                break;


        }


    }


    public static void CreateAC() {


        Scanner Sc = new Scanner(System.in);
        System.out.print("Name: ");
        String Name = Sc.nextLine();
        System.out.print("Phone: ");
        String Phone = Sc.nextLine();
        System.out.print("Deposit: ");
        double Bl = Sc.nextDouble();


        int upperbound = 9999999;
        int lowerbound = 1000000;
        Random rand = new Random();
        int random_integer = rand.nextInt(upperbound - lowerbound) + lowerbound;

        String ACID = "SHAH" + random_integer + "X";

        Account[AClist] = new UserData(Name, ACID, Phone, Bl);


        System.out.println("Account Create Successful");


        System.out.println("Account Details\n" +
                "Name: " + Account[AClist].getUserName() + "\n" +
                "Phobe: " + Account[AClist].getPhoneNumber() + "\n" +
                "Balance: " + Account[AClist].getBalance() + "\n" +
                "Account ID: " + Account[AClist].getAcountID() + "\n"
        );


        Select();

    }


    public static void deposit_money() {

        System.out.println("Enter Your Deposit Ammount");

        Scanner Sc = new Scanner(System.in);

        double Ammount = Sc.nextDouble();

        Account[AClist].setBalance(Account[AClist].getBalance() + Ammount);
        System.out.println("Account Deposit Successful");
        System.out.println("Current Balance: " + Account[AClist].getBalance() + " Tk");


        Select();
    }


    public static void withdraw_money() {

        System.out.println("Enter Your Withdraw Ammount");

        Scanner Sc = new Scanner(System.in);

        double Ammount = Sc.nextDouble();

        Account[AClist].setBalance(Account[AClist].getBalance() - Ammount);
        System.out.println("Account Withdraw Successful");
        System.out.println("Current Balance: " + Account[AClist].getBalance() + " Tk");

        Select();
    }


}
