import java.util.Scanner;

interface Project{

     double revenue();
    double cost();

}

class PrivateProject implements Project
{
    private double factoryCost;
    private double estimatedRevenue;

    PrivateProject(double factoryCost, double estimatedRevenue) {
        this.factoryCost = factoryCost;
        this.estimatedRevenue = estimatedRevenue;
    }

    public double cost() {
        double cost;
        return cost= 1.5*(factoryCost);
    }

    public double revenue() {
        double revenue;
        return revenue=estimatedRevenue*2;
    }

}

class PublicProject implements Project
{
    private double factoryCost;
    private double wageCost;
    private double estimatedRevenue;

    PublicProject(double factoryCost, double wageCost, double estimatedRevenue)
    {
        this.factoryCost = factoryCost;
        this.wageCost = wageCost;
        this.estimatedRevenue = estimatedRevenue;
    }

    public double cost() {
        double cost;
        return cost = 1.5 * (factoryCost + wageCost);
    }

    public double revenue() {
        double revenue;
        return revenue = estimatedRevenue*2.5;
    }
}



public class Problem2 {

    public static void main(String args[]) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        PublicProject obj = new PublicProject(a, b, c );

        double cost = obj.cost();
        double revenue = obj.revenue();
        System.out.println("Cost : " + cost );
        System.out.println("Revenue : " + revenue);

        sc.close();
    }
}