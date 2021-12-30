package CT3;

import javax.swing.*;
import java.awt.*;

public class Border {
    JFrame f;
    Border(){
        f=new JFrame("Application");

        JButton b1=new JButton("header");;
        JButton b2=new JButton("footer");;
        JButton b3=new JButton("ads");;
        JButton b4=new JButton("links");;
        JButton b5=new JButton("contents");;

        f.add(b1, BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);

        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Border();
    }
}
