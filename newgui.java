import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;





public class newgui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator ");
        frame.setSize(250, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JTextField inputA = new JTextField(15);
        JTextField inputB = new JTextField(15);
        JTextField result = new JTextField(15);


        JButton Add = new JButton("Add");
        JButton Subtract = new JButton("Subtract");
        JButton Multiply = new JButton("Multiply");




        frame.add(inputA);
        frame.add(inputB);
        frame.add(result);
        frame.add(Add);
        frame.add(Subtract);
        frame.add(Multiply);



        frame.setVisible(true);



        Add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

int output = Integer.parseInt(inputA.getText()) + Integer.parseInt(inputB.getText()) ;

        result.setText(String.valueOf(output));



                try {
                    Writer  Out = new BufferedWriter(new FileWriter("history.txt", true));
                    Out.write(String.valueOf(output) + "\n");
                    Out.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }








            }
        });


        Subtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                int output = Integer.parseInt(inputA.getText()) - Integer.parseInt(inputB.getText()) ;

                result.setText(String.valueOf(output));


                try {
                    Writer  Out = new BufferedWriter(new FileWriter("history.txt", true));
                    Out.write(String.valueOf(output) + "\n");
                    Out.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }


            }
        });

        Multiply.addActionListener(e -> {


            int output = Integer.parseInt(inputA.getText()) * Integer.parseInt(inputB.getText()) ;

            result.setText(String.valueOf(output));


            try {
                Writer  Out = new BufferedWriter(new FileWriter("history.txt", true));


                Out.write(String.valueOf(output) + "\n");
                Out.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }






        });



    }


}