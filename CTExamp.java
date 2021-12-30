import java.util.Scanner;

public class CTExamp{

    public static void main(String[] args) {


        double CTArray[] = new double[7];



        Scanner sc=new Scanner(System.in);

        for(int i =0;i<7;i++){



            CTArray[i] = sc.nextInt();

        }

        for(int i =4;i<7;i++) {


            System.out.println("elements  : " + CTArray[i]);

        }



        double max=0;




        for(int i =0;i<7;i++){


            if(max<CTArray[i]){
                max=CTArray[i];

            }


        }


        System.out.println("Sum of the largest element and the last element  : " + (max + CTArray[6]));

    }



}