
// Java Inner Class: Anonymous Inner Class
/*
class Animal {
    void makeSound() {
        System.out.println("Animal is making sound");
    }
}*/

    interface Animal {
        void makeSound();

        void eat();
    }

class Bird implements Animal {
    public void makeSound(){
        System.out.println("Bird is chripping");
    }
    public void eat(){}

}

class Test6{
    public static void main(String[] args) {
        // Anonymous inner class
        Animal a = new Animal(){
            public void makeSound(){
                System.out.println("Bird is chripping");
            }
            public void eat(){

            }
        };

        // a will refer to a child class object of Animal
        a.makeSound();

        // Anonymous inner class code creates a child class, inside which we can override
        // parent methods
        // It will create an object of the inner class, and we will be able to access that
        // object using a parent reference
    }
}











/*

package Class18;

        import javax.swing.*;
        import java.awt.*;

public class GUI1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);

        JButton okButton = new JButton();
        okButton.setBackground(new Color(16,250,116));
        okButton.setText("Ok");

        JButton cancelButton = new JButton("Cancel");

        JLabel label = new JLabel("This is a JLabel");

        JTextField tf = new JTextField(15);

        panel.add(okButton);
        panel.add(cancelButton);
        panel.add(label);
        panel.add(tf);

        frame.add(panel);

        frame.setVisible(true);
    }
}
*/