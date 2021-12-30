import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;





public class age {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My GUI App");
        frame.setSize(250, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JTextField birthYearTF = new JTextField(15);
        JButton showButton = new JButton("Show");
        JTextField ageTF = new JTextField(15);

        frame.add(birthYearTF);
        frame.add(showButton);
        frame.add(ageTF);

        // YOUR CODE HERE

        frame.setVisible(true);



        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {




                String Population;
                String Country;
                double physicsMarks;
                double chemistryMarks;
                double mathMarks;


                try {
                    File Object = new File("C:\\Users\\shahr\\IdeaProjects\\Dina\\src\\input.txt");
                    Scanner Reader = new Scanner(Object);

                    if(Reader.hasNextLine())
                    {
                       // nStudent = Reader.nextInt();
                        String data = Reader.nextLine();
                    }

                  //  student = new Student[nStudent];

                    while ( Reader.hasNextLine()){

                        String data = Reader.nextLine();

                        String[] in = data.split(" ");

                        Country = in[0];
                        Population = in[1];

                       if(Country.equals(birthYearTF.getText())){

                           ageTF.setText(String.valueOf(Population));


                       }


                    }
                    Reader.close();

                } catch (FileNotFoundException | NumberFormatException p) {
                    System.out.println("An error occurred.");
                    p.printStackTrace();
                }


            }
            });



    }


}