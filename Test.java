interface MyInterface
{

    public void A1();
    public void A2();
}
class Demo implements MyInterface
{
    public void A1()
    {
        System.out.println("implementation of method1");
    }
    public void A2()
    {
        System.out.println("implementation of method2");
    }
    public static void main(String arg[])
    {

        MyInterface obj = new Demo();
        obj.A1();
        
    }


}