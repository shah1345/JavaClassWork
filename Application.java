class Wizard {
    String name;
    Wizard(String n)
    {
        name=n;
    }
}


public class Application {
    public static void main(String[] args) {
        Wizard w1=new Wizard("Hagrid");
        Wizard w2=new Wizard("Sirius");
        Wizard w3=new Wizard("Harry");
        w1=w2;
        w2=w3;
        w3=w1;
        System.out.println(w1.name);
        System.out.println(w2.name);
        System.out.println(w3.name);
    }
}

