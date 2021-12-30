package CT;


class Parent{

    int v1;
    public Parent(int v1) {

        this.v1 = v1;


    }

}



class Chaild extends Parent{

    int v2;
    public Chaild(int p1,int p2) {
        super(p2);
        this.v2 = p1;


    }



}









public class Test2 {

    public static void main (String[] args){

        Chaild C = new Chaild(20,10);



System.out.println(C.v1 + " "+ C.v2);
    }


}
