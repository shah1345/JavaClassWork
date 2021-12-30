public class C extends B {

    C() {
        System.out.println("Inside C");

    }

    C(String msg) {
        System.out.println("C: " + msg);
    }

    public static void main(String[] args){

        C c1 = new C();
        C c2 = new C("University");

    }
}




