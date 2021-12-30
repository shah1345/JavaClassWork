package CT3;

class Outer {
    int x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    // this is an inner class
    class Inner {
        int x = 0;
        int y = 10;

        void display() {
            // Print the outer x value here.
            System.out.println(Outer.this.x);


      //      X is a value of Outer class so Inner class cant't get x value directly.
        }
    }
    void showy() {
       // System.out.println(y);
    }
}
class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    } }