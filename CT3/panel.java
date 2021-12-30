package CT3;

import javax.swing.*;
import java.awt.*;


public class panel {
    panel()
    {
        JFrame myframe;
        myframe=new JFrame();
        myframe.setLayout(new BorderLayout());
//Set Frame title here "Class Test!!!"
        myframe.setTitle("Class Test!!!");
        myframe.setSize(200, 200);
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3));
        JLabel cell[] = new JLabel[9];
        for(int i=0; i<9; i++){
            cell[i]=new JLabel(String.valueOf(i));

//Complete the code to add label 0 to 9 and add to necessary panel

            cell[i].setFont(new Font("Cambria", 2, 24));
            center.add(cell[i]);

        }
        JPanel top = new JPanel();
        top.setLayout(new GridLayout());
//Add code for button Change and Reset and add to necessary panel

        top.add(new Button("Change"));
        top.add(new Button("Reset"));

        myframe.add(top, BorderLayout.NORTH);
        myframe.add(center, BorderLayout.CENTER);
        myframe.setVisible(true);
//Set frame visibility true
    }
    public static void main(String[] args) {
        new panel();
    }
}