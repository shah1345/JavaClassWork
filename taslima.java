import java.util.Scanner;



public class taslima {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int  nbr = sc.nextInt();


        int CoinArray[] =  new int[nbr];
        boolean X[] =  new boolean[nbr];

        int sum=0,storedata=0,needed=sum/2+1,number=0;


        for(int i=0;i<nbr;i++){

            CoinArray[i]=sc.nextInt();

            sum+= CoinArray[i];

            X[i]=false;

        }

        for(int i=0;i<nbr;i++){

            int L_inde=0;

            for(int j=1;j<nbr;j++)

                if( !X[i] &&   CoinArray[j] >  CoinArray[L_inde])
                    L_inde=j;

                X[L_inde]=true;

                storedata +=CoinArray[L_inde];
                number++;
                if(storedata >= needed)
                    break;

        }
        System.out.println(number+1);

    }

}
