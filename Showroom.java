import java.util.Scanner;

class Inventory extends Exception
{
    private int FZS, R15_V3, Fazer, R15_V2;

    // this is for show the exception msg.
    public Inventory(String s)
    {
        super(s);
    }

    // default constructor
    public Inventory()
    {
        this.FZS = 100;
        this.R15_V3 = 100;
        this.Fazer = 100;
        this.R15_V2 = 100;

    }



    //Getter function
    public int getFZS()
    {
        return this.FZS;
    }

    public void setFZS(int FZS) //setter function
    {
        this.FZS = FZS;
    }

    public int getR15_V3()  //Getter function
    {
        return this.R15_V3;
    }

    public void setR15_V3(int R15_V3) //setter function
    {
        this.R15_V3 = R15_V3;
    }

    public int getFazer() //Getter function
    {
        return this.Fazer;
    }

    public void setFazer(int Fazer) //setter function
    {
        this.Fazer = Fazer;
    }

    public int GetR15_V2()  //Getter function
    {
        return this.R15_V2;
    }

    public void SetR15_V2(int R15_V2) //setter function
    {
        this.R15_V2 = R15_V2;
    }

}



public class Showroom {

    // this is for check exception
    static void validate(int FZS, int R15_V3, int Fazer, int R15_V2)throws Inventory
    {
        if(FZS<30 || R15_V3<40 || Fazer<34 || R15_V2<50)
        {
            throw new Inventory("Inventory running dry");
        }

    }

    public static void main(String[] args) {

        Inventory data = new Inventory();
        Scanner scan = new Scanner(System.in);  // it will take input from user
        int Input;

        try
        {	while(true)
        {
            // for buying.
            System.out.println("Choose Your Bike Model:" +"\n"+ "1.FZS," + "\n"+ "2.R15_V3, "+"\n"+ "3.Fazer,  "+"\n"+"4.R15_V2" +"\n");
            System.out.print("Your choice : ");
            Input = scan.nextInt();

            if(Input == 1)
            {
                // reduce 1
                data.setFZS(data.getFZS() - 1);
            }
            else if(Input == 2)
            {
                // reduce 2
                data.setR15_V3(data.getR15_V3() - 1);
            }
            else if(Input == 3)
            {
                // reduce 3
                data.setFazer(data.getFazer() - 1);
            }
            else if(Input == 4)
            {
                // reduce 4
                data.SetR15_V2(data.GetR15_V2() - 1 );
            }
            else
            {
                System.out.println("Invalid input. !");
            }
            // showing the inventory
            System.out.println("Current inventory : " + "FZS = "+data.getFZS()+", R15_V3 = "+ data.getR15_V3() +", Fazer = "+data.getFazer()+", R15_V2 = " + data.GetR15_V2()+ "\n");

            // to check inventory validation.
            validate(data.getFZS(), data.getR15_V3(), data.getFazer(), data.GetR15_V2());
        }

        }catch(Exception m)
        {

            System.out.println("Exception Occured: "+m);
        }

        scan.close();

    }

}
