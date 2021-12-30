import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


class Part2or implements ActionListener {
    JButton Button1 = new JButton("Button_1");
    JButton Button2 = new JButton("Button_2");

    Part2or() {
        JFrame frame = new JFrame("Color Change");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        Button1.setBackground(Color.red);
        Button2.setBackground(Color.blue);

        Button1.addActionListener(this::actionPerformed);
        Button2.addActionListener(this::actionPerformed);

        frame.add(Button1);
        frame.add(Button2);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Part2or();
    }

    public void actionPerformed(ActionEvent e) {





        if (e.getSource() == Button1) {









            if(Button1.getBackground().equals(Color.decode("#FF0000"))){

                Button1.setBackground(Color.decode("#00FF00"));

            } else {

                Button1.setBackground(Color.decode("#FF0000"));

            }



        } else if(e.getSource() == Button2){





            if(Button2.getBackground().equals(Color.decode("#0000FF"))){

                Button2.setBackground(Color.decode("#00FFFF"));

            } else {

                Button2.setBackground(Color.decode("#0000FF"));

            }


       }


    }
}