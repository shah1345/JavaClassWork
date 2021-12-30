 class Parent{

  private int v1=10;
  void msg1(){

      System.out.print(v1);
  }


 }


class Chaild extends Parent{

    private int v2 =20;
    void msg2(){
        msg1();
        System.out.print("--"+ v2);

    }


}



class te {

     public static void main(String[] args){

         Chaild c = new Chaild();
c.msg2();



     }

}
