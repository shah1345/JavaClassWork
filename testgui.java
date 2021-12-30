class Test{
    private int a;
    int b;
    static int c;
    class Inner1{
        public void m(){
            System.out.println(a);//1
            System.out.println(b);//2
            System.out.println(c);//3
        }
    }
    static class Inner2{
        

        public void m(){
            System.out.println(a);//4
            System.out.println(b);//5
            System.out.println(c);//6
        }
    }
}