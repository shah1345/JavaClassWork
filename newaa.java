import javax.swing.*;
import java.awt.*;

class Newaa {
    public Newaa(){
        JFrame f= new JFrame("CarShowroom");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,300);
        f.setLayout(new FlowLayout());

        String s1[]= {"AUDI", "BMW", "Jack", "Prade","Pazaro"};
        JComboBox cb= new JComboBox(s1);
        JButton b1= new JButton("Show");
        JPanel panel= new JPanel();
        panel.add(cb);
        panel.add(b1);
        f.add(panel);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new Newaa();
    }
}