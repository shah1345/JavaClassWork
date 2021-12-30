package CT3;

import javax.swing.*;

public class CToF {
    public static void main(String[] args) {

        JFrame J  = new JFrame("CTOF Convetor-OOP Final");

        J.setSize(300, 210);

        JTextField Cint = new JTextField(15);


        JTextField result = new JTextField(15);
        JButton Add = new JButton("Convert To Fahrenheit");
        JLabel lusd =  new JLabel("C");
        JLabel Fin = new JLabel("F");


        JLabel EnterC =  new JLabel("Enter Celsius Value:");
        JLabel EnterF = new JLabel("Fahrenheit Value:");


        EnterC.setBounds(10, 10, 140, 20);
        Cint.setBounds(145, 10, 100, 20);
        lusd.setBounds(260, 10, 50, 20);

        Add.setBounds(25, 60, 170, 20);


        EnterF.setBounds(10, 100, 140, 20);
        result.setBounds(145, 100, 100, 20);
        Fin.setBounds(260, 100, 50, 20);

        Add.addActionListener(evt -> result.setText((Double.parseDouble(Cint.getText())*1.8) +32+ ""));



        J.add(Cint);
        J.add(lusd);
        J.add(Add);
        J.add(result);
        J.add(Fin);
        J.add(EnterC);
        J.add(EnterF);
        J.setLayout(null);
        J.setVisible(true);





    }
}
