package FinalPrep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class guisol {

    public static void main(String[] args) {


        JFrame fr = new JFrame("RUN");

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setSize(250, 100);


        JLabel label = new JLabel("");
        JButton button = new JButton("Click");

        fr.setLayout(new FlowLayout());

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (label.getText().equals("")) {
                    label.setText("3");
                } else if (label.getText().equals("3")) {
                    label.setText("2");
                } else if (label.getText().equals("2")) {
                    label.setText("1");
                } else if (label.getText().equals("1")) {
                    label.setText("Go.!");
                }
            }
        });


        fr.add(label);
        fr.add(button);

        fr.setVisible(true);


    }


}
