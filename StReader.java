import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

class WStudent{
    private int id;
    public String name;
    private double physics_marks;
    private double chemistry_marks;
    private double math_marks;
    public double totalMarks;

//    public WStudent(int id, String rahim, double physics_marks) {
//    }

    int getId(){
        return id;
    }
    void set(int id){
        this.id=id;
    }
    double get1(){
        return physics_marks;
    }
    void set(double a){
        this.physics_marks=a;
    }
    double get(){
        return chemistry_marks;
    }
    double get2(){
        return math_marks;
    }
    public WStudent(int id, String name, double physics_marks,double chemistry_marks,double math_marks){
        this.name=name;
        this.id=id;
        this.physics_marks=physics_marks;
        this.chemistry_marks=chemistry_marks;
        this.math_marks=math_marks;

    }
    void printinfo(String name,int id,double totalMarks){
        System.out.println("name:"+name +"id:"+id+" totalMarks:"+totalMarks);
    }
}
public class StReader {
    public static void main(String[] args) {
        int nStudent=0;
        WStudent[] st=new WStudent[3];
        st=new WStudent[nStudent];


        try{
            FileReader f=new FileReader("C:\\Users\\shahr\\IdeaProjects\\student\\input.txt");
            BufferedReader r=new BufferedReader(f);

            String s="";



           // while(s!=null) {


                s = r.readLine();

                nStudent= Integer.parseInt(s);
                // int i = 0;

                for (int i = 0; r.ready(); i++) {

                    String data = r.readLine();
                    System.out.println(data);

                    if (nStudent <= i) {
                        break;
                    }
                    String[] words = data.split(" ");
                    int id = Integer.parseInt(words[0]);
                    String name = words[1];
                    //System.out.println(name);
                    double physics_marks = Double.parseDouble(words[2]);
                    double chemistry_marks = Double.parseDouble(words[3]);
                    double math_marks = Double.parseDouble(words[4]);
                    double totalMarks = physics_marks +chemistry_marks + math_marks ;


                  //  st[i] = new WStudent(id, name, physics_marks, chemistry_marks, math_marks);
                //   st[i].printinfo(name, id, totalMarks);


                   // System.out.println(physics_marks);
                }


            r.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        try {

            FileWriter fw=new FileWriter("Output.txt");
            PrintWriter w=new PrintWriter(fw);





            ArrayList<WStudent>l=new ArrayList<WStudent>();
            WStudent p1=new WStudent(34,"Rahim",100,20, 40 );
            WStudent p2=new WStudent(44,"Karim",50,50,50);
            WStudent p3=new WStudent(12,"Azim",100,100,55);

            l.add(p1);
            l.add(p2);
            l.add(p3);

            //Collections.sort(s,Collections.reverseOrder());
            class sortByTotalMarks implements Comparator<WStudent>{
                public int compare(WStudent s1, WStudent s2){
                    if(s1.totalMarks> s2.totalMarks){
                        return 1;
                    }
                    return -1;
                }
            }
            for(int i=0; i<nStudent; i++){
                int id=st[i].getId();
                String name=st[i].name;
                double physics_marks=st[i].get1();
                double chemistry_marks=st[i].get();
                double math_marks=st[i].get2();
                // double totalMarks=st[i].totalMarks;
                double totalMarks=(int) (physics_marks+chemistry_marks+math_marks);

                String sw="name:"+name+"id:"+id+"totalMarks:"+totalMarks + "\n";
                fw.write(sw);
            }
            w.close();
        }catch (FileNotFoundException i){
            i.printStackTrace();
        }catch (IOException i){
            i.printStackTrace();
        }
    }
}