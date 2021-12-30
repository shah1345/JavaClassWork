import java.awt.event.*;
import javax.swing.*;

class btnclick extends JFrame implements ActionListener
{

    JButton b1;


    btnclick()
    {

        this.setLayout(null);


        b1 = new JButton("Click");


        b1.setBounds(130, 100, 100, 30);
        this.add(b1);


        b1.addActionListener(this);
    }


    public void actionPerformed(ActionEvent evt)
    {
        if (evt.getSource() == b1)
        {

            JOptionPane.showMessageDialog(this, "Alice in OOP Land",
                    "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

class MessageDialogs1 {


    public static void main(String args[])
    {

        btnclick f = new btnclick();


        f.setBounds(200, 200, 400, 300);


        f.setResizable(false);


        f.setVisible(true);
    }
}