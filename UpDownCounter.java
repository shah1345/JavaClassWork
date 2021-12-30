import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UpDownCounter extends JFrame {
    private JTextField both;
    private JButton upCounter , downCounter , reset;
    private Container c;
    public UpDownCounter(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Counter");
        setBounds(0,0,500,250);
        c = getContentPane();
        c.setLayout(null);
        both = new JTextField("0");
        both.setBounds(200,5,100,50);
        c.add(both);











        upCounter = new JButton("UP");
        upCounter.setBounds(90,60,100,50);
        c.add(upCounter);
        actionHandler up=new actionHandler();
        upCounter.addActionListener(up);











        downCounter = new JButton("Down");
        downCounter.setBounds(200,60,100,50);
        c.add(downCounter);
        actionHandler down=new actionHandler();
        downCounter.addActionListener(down);














        reset = new JButton("Reset");
        reset.setBounds(310,60,100,50);
        c.add(reset);
        actionHandler rst=new actionHandler();
        reset.addActionListener(rst);

// add necessary code here.
    }


    int add = 0;

    class actionHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
             add = Integer.parseInt(both.getText());


            if(e.getSource() == upCounter){
                add++;

                both.setText(String.valueOf(add));

            }
            if(e.getSource() == downCounter){

                add--;

                both.setText(String.valueOf(add));

            }
            if(e.getSource() == reset){
                add=0;

                both.setText(String.valueOf(add));


            }






// add necessary code here.
        }
    }
    public static void main(String[] args) {

        new UpDownCounter();


// add necessary code here.
    }
}