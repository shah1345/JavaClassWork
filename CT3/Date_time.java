package CT3;


import java.util.Scanner;

public class Date_time {

   public static void main(String[] args) {


       String Timr ="2-45-56";
       String Date ="05-09-2021";

      // 17-00-00           07-01-2020

       Scanner sc= new Scanner(System.in);

       System.out.print("Enter a Time: ");
       Timr= sc.nextLine();


       System.out.print("Enter a Date: ");
        Date= sc.nextLine();












       String[] TimeArray = Timr.split("-");
       String[] DateArray = Date.split("-");



       int hh  = Integer.parseInt(TimeArray[0]);
       int mm   = Integer.parseInt(TimeArray[1]);
       int ss  = Integer.parseInt(TimeArray[2]);


       int dd  = Integer.parseInt(DateArray[0]);
       int month  = Integer.parseInt(DateArray[1]);
       int yyyy  = Integer.parseInt(DateArray[2]);

String output="";


     //  Spring (Feb 14 – May 13), Summer (May 14 – Aug 13), Autumn (Aug 14 – Nov 13) and Winter (Nov 13 – Feb 13). Take a look at the following examples:
       if(month>=2 && dd <=14 || month<=5 && dd <=13 ){
           output += "It’s a Spring";

       } else if (month>=5 && dd <=14 || month>=8 && dd <=13){

           output += "It’s a Summer";

       }
       else if (month>=8 && dd <=14 ||month<=11 && dd <=13){

           output += "It’s a Autumn";

       }

       else if (month>=11 && dd <=14 ||month<=1 && dd <=13){

           output += "It’s a Winter";

       }


   //    morning (6 AM – 11:59 AM) / afternoon (12 PM – 5:59 PM) / evening (6 PM – 11: 59 PM)




       if(hh>=6 && mm >=0 ||hh<=11 && mm <=59 ){
           output += " morning";

       } else if (hh>=12 && mm >=0 ||hh<=5 && mm <=59){

           output += " afternoon";

       }
       else if (hh>=6 && mm >=0 ||hh<=11 && mm <=59){

           output += " evening";

       }

       output +=" " +yyyy +"!";





       System.out.println(output);






   }
}
