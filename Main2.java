class Doctor{
    public String name;
    public int rank;
    public double basicSalary;

    Doctor(String name,int rank,double basicSalary){
        this.name=name;
        this.rank=rank;
        this.basicSalary=basicSalary;
    }
    public double getSalary(){
        return basicSalary;
    }
    void print(){
        System.out.println("Name: "+name+" Salary:"+getSalary());
    }
}
class GradeA extends Doctor{
    private double incentive;
    private double yearlyBonus;
    GradeA(String name, int rank, double basicSalary,double incentive,double yearlyBonus) {
        super(name, rank, basicSalary);
        this.incentive=incentive;
        this.yearlyBonus=yearlyBonus;
    }
    public double getSalary(){
        double salary= (1+incentive)*(basicSalary+yearlyBonus);
        return salary;
    }
    void print(){
        System.out.println("Name: "+name+" Salary:"+getSalary());
    }
}

class GradeB extends Doctor{
    private double monthlyBonus;

    GradeB(String name, int rank, double basicSalary,double monthlyBonus) {
        super(name, rank, basicSalary);
        this.monthlyBonus=monthlyBonus;
    }
    public double getSalary(){
        return basicSalary+12*monthlyBonus;
    }
    void print(){
        System.out.println("Name: "+name+" Salary:"+getSalary());
    }
}
public class Main2 {

    public static void main(String[] args) {
        // write your code here
        Doctor[] doctors=new Doctor[3];
        doctors[0]=new GradeA("MR.A",1,1000,10.2,100);
        doctors[1]=new GradeA("MR.B",2,1000,10,94);
        doctors[2]=new GradeB("MR.C",1,1000,100);
        for(int i=0;i<3;i++){
            System.out.println("Name: "+doctors[i].name+" Salary: "+doctors[i].getSalary());
        }
    }
}