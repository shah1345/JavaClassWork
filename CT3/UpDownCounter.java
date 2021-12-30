package CT3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpDownCounter extends JFrame {
    private JTextField both;
    private JButton upCounter;
    private JButton downCounter;
    private JButton reset;
    private Container c;
    int add = 0;

    public UpDownCounter() {
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setTitle("Counter");
        this.setBounds(0, 0, 500, 250);
        this.c = this.getContentPane();
        this.c.setLayout((LayoutManager)null);
        this.both = new JTextField("0");
        this.both.setBounds(200, 5, 100, 50);
        this.c.add(this.both);
        this.upCounter = new JButton("UP");
        this.upCounter.setBounds(90, 60, 100, 50);
        this.c.add(this.upCounter);
        UpDownCounter.actionHandler up = new UpDownCounter.actionHandler();
        this.upCounter.addActionListener(up);
        this.downCounter = new JButton("Down");
        this.downCounter.setBounds(200, 60, 100, 50);
        this.c.add(this.downCounter);
        UpDownCounter.actionHandler down = new UpDownCounter.actionHandler();
        this.downCounter.addActionListener(down);
        this.reset = new JButton("Reset");
        this.reset.setBounds(310, 60, 100, 50);
        this.c.add(this.reset);
        UpDownCounter.actionHandler rst = new UpDownCounter.actionHandler();
        this.reset.addActionListener(rst);
    }

    public static void main(String[] args) {
        new UpDownCounter();
    }

    class actionHandler implements ActionListener {
        actionHandler() {
        }

        public void actionPerformed(ActionEvent e) {
            UpDownCounter.this.add = Integer.parseInt(UpDownCounter.this.both.getText());
            if (e.getSource() == UpDownCounter.this.upCounter) {

                if(UpDownCounter.this.add<7)
                ++UpDownCounter.this.add;
                UpDownCounter.this.both.setText(String.valueOf(UpDownCounter.this.add));
            }

            if (e.getSource() == UpDownCounter.this.downCounter) {
                if(UpDownCounter.this.add>0)
                --UpDownCounter.this.add;
                UpDownCounter.this.both.setText(String.valueOf(UpDownCounter.this.add));
            }

            if (e.getSource() == UpDownCounter.this.reset) {
                UpDownCounter.this.add = 0;
                UpDownCounter.this.both.setText(String.valueOf(UpDownCounter.this.add));
            }

        }
    }
}
