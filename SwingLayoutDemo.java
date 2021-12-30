import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingLayoutDemo {
    private JFrame mainFrame;

    private JPanel controlPanel;


    public SwingLayoutDemo(){
        prepareGUI();
    }
    public static void main(String[] args){
        SwingLayoutDemo swingLayoutDemo = new SwingLayoutDemo();
        swingLayoutDemo.showBorderLayoutDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Application");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));



        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());


        mainFrame.add(controlPanel);

        mainFrame.setVisible(true);
    }
    private void showBorderLayoutDemo(){


        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setSize(400,200);
        BorderLayout layout = new BorderLayout();
        layout.setHgap(2);
        layout.setVgap(2);

        panel.setLayout(layout);
        panel.add(new JButton("contents"),BorderLayout.CENTER);
        panel.add(new JButton("links"),BorderLayout.LINE_START);
        panel.add(new JButton("ads"),BorderLayout.LINE_END);
        panel.add(new JButton("East"),BorderLayout.EAST);
        panel.add(new JButton("West"),BorderLayout.WEST);
        panel.add(new JButton("header"),BorderLayout.NORTH);
        panel.add(new JButton("footer"),BorderLayout.SOUTH);

        controlPanel.add(panel);


        mainFrame.setVisible(true);
    }
}