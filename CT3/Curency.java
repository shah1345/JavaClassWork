package CT3;

import javax.swing.*;

public class Curency {
    public static void main(String[] args) {


        JFrame J  = new JFrame("Convetor");

        J.setSize(210, 210);

        JTextField USDV = new JTextField(15);


        JTextField result = new JTextField(15);
        JButton Add = new JButton("Convert");
        JLabel lusd =  new JLabel("USD");
        JLabel EURO = new JLabel("EURO");

        USDV.setBounds(10, 10, 100, 30);
        lusd.setBounds(130, 10, 50, 30);



        Add.setBounds(10, 60, 100, 20);

        Add.addActionListener(evt -> result.setText((Double.parseDouble(USDV.getText()) * 0.88) +""));


        result.setBounds(10, 100, 100, 30);
        EURO.setBounds(130, 100, 50, 30);





        J.add(USDV);
        J.add(lusd);
        J.add(Add);
        J.add(result);
        J.add(EURO);
        J.setLayout(null);
        J.setVisible(true);





    }











}
