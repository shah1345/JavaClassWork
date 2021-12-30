import javax.swing.*;
import java.awt.*;



public class Aurna {


    public static void main(String[] args) {
        JFrame frame = new JFrame("My Application");


        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setLayout(new FlowLayout());
        JButton upButton = new JButton();
        upButton.setText("UP");

        upButton.setBounds(0,0,400,25);


        JLabel middlelebel = new JLabel();

        middlelebel.setText("a eysetg asewtgsegesagawe.");

        middlelebel.setBounds(10,30,350,20);



        JTextField downtxtfild =new JTextField();

        downtxtfild.setBounds(10,60,350,30);
        frame.add(upButton);
        frame.add(middlelebel);
        frame.add(downtxtfild);
        frame.setLayout(null);
        frame.setVisible(true);



    }


}