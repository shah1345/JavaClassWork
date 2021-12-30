package CT3OOP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUIAll{
    JFrame f;
    GUIAll(){
        f=new JFrame();
        f.setSize(200,200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField T1 = new JTextField();
        JTextField T2 = new JTextField();

        JButton b1=new JButton("Done");

        T1.setBounds(10, 10, 150, 20);
        T2.setBounds(10, 50, 150, 20);
        b1.setBounds(50, 100, 100, 20);

        b1.addActionListener(new ActionListener(){



            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(T1.getText());
                T1.setText(value /10  +"");
                T2.setText(value * 10 +"");
            }
        });





        f.add(b1);f.add(T1);f.add(T2);
        f.setVisible(true);
    }
    public static void main(String[] args) {

        new GUIAll();
    }
}