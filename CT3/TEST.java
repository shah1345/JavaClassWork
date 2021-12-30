package CT3;

class Test {
    void printDetails(Gadget g) {
        g.details();

    }


    static class Gadget {

        void details() {

            System.out.println("A gadget is a  small mechanical or electronic device or tool, especially an ingenious or novel one.");


        }


    }

    static class SmartWatch extends Gadget {

        void details() {

            System.out.println("A smartwatch is a mobile device with a touchscreen display, designed to be worn on the wrist..");


        }

    }

    static class SmartTV  extends Gadget {

        void details() {

            System.out.println("A Smart TV is any TV that can provide additional programs through internet connectivity.");


        }

    }


    public static void main(String[] args) {
        Test t = new Test();
        t.printDetails(new Gadget());
        t.printDetails(new SmartWatch());
        t.printDetails(new SmartTV());
    }
}