import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUITest {

    public static void main(String[] args) {








        JFrame f= new JFrame("Oceans App") ;
        JPanel panel = new JPanel();

        f.setContentPane(panel);


        f.setSize(300,150);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());




        String[] oceans = {"Arctic","North Atlantic","South Atlantic","Indian","North Pacific","South Pacific","South Pacific","Antarctic"};



        JTextField tf1 = new JTextField(20);
        JTextField tf2 = new JTextField(20);
        JButton Show = new JButton("Show");

        tf1.setText("");
        tf2.setText("");


        panel.add(tf1);
        panel.add(tf2);
        panel.add(Show);




        f.setVisible(true);


        Show.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String TEXTDATAS = oceans[Integer.parseInt(tf1.getText())];

                tf2.setText(TEXTDATAS);





            }
        });






    }







}
