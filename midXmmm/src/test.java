public class test {
    public static void main(String[] args) {

        double[] Array = new double[8];

        Array[0]=3.6;
        Array[1]=5.5;
        Array[2]=3.5;
        Array[3]=4.5;
        Array[4]=3.55;
        Array[5]=3.5;
        Array[6]=43.5;
        Array[7]=33.5;



        for(int i =0;i<7;i++ ){

          double sum =  Array[i] + Array[i+1];

          if (sum<10){
              System.out.println(sum);

          }


        }







    }


}
