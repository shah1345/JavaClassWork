

class Paarent {

    private int var1;
    private int var2;

    public Paarent(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;

    }



    void displaay() {

        System.out.println(var1 + " " + var2);

    }


     static class Chailddd extends Paarent {


        int var3;

         Chailddd(int var1, int var2,int var3) {
             super(var1,var2);


             this.var3=var3;


        }


        void displaay() {

           super.displaay();

            System.out.println(var3);

        }

    }


    public static class Main {

        public static void main(String[] args) {

            Chailddd chaildobj = new Chailddd(10, 20, 30);
            chaildobj.displaay();


        }


    }

}