package CT3OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ext3 {

    public static void main(String[] args) {


        Scanner Sc = new Scanner(System.in);

        int nbr1 = Sc.nextInt();
        int nbr2 = Sc.nextInt();

        int nbr1u = nbrCheck(nbr1);
        int nbr2u = nbrCheck(nbr2);

        if (nbr1u > nbr2u) {
            System.out.println("1st Number greater");


        } else System.out.println("2nd Number greater");


    }


    public static int nbrCheck(int nbr) {

        try {
            if (nbr > 100) {

                throw new InputMismatchException();

            }

        } catch (InputMismatchException e) {

            int X = nbr / 100;
            return X;

        }

        return nbr;
    }

}
