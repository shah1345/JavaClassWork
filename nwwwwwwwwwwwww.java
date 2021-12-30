import java.awt.*;
import javax.swing.*;


class Dina extends JFrame {

    Dina()
    {


        JPanel pa = new JPanel();


        pa.setLayout(new BorderLayout());


        pa.add(new JButton("header"), BorderLayout.NORTH);
        pa.add(new JButton("footer"), BorderLayout.SOUTH);
        pa.add(new JButton("ads"), BorderLayout.EAST);
        pa.add(new JButton("links"), BorderLayout.WEST);
        pa.add(new JButton("contents"), BorderLayout.CENTER);
        add(pa);
        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
}

class MainFrame {
    public static void main(String[] args)
    {


        new Dina();
    }
}