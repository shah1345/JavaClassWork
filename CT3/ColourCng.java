package CT3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ColourCng implements ActionListener {
    JButton Button1 = new JButton("Button_1");
    JButton Button2 = new JButton("Button_2");

    ColourCng() {
        JFrame frame = new JFrame("Color");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(new FlowLayout());
        this.Button1.setBackground(Color.red);
        this.Button2.setBackground(Color.blue);
        this.Button1.addActionListener(this);
        this.Button2.addActionListener(this);
        frame.add(this.Button1);
        frame.add(this.Button2);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ColourCng();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.Button1) {
            if (this.Button1.getBackground().equals(Color.decode("#FF0000"))) {
                this.Button1.setBackground(Color.decode("#00FF00"));
            } else {
                this.Button1.setBackground(Color.decode("#FF0000"));
            }
        } else if (e.getSource() == this.Button2) {
            if (this.Button2.getBackground().equals(Color.decode("#0000FF"))) {
                this.Button2.setBackground(Color.decode("#00FFFF"));
            } else {
                this.Button2.setBackground(Color.decode("#0000FF"));
            }
        }

    }
}
