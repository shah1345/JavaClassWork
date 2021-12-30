import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

class CurrencyConvert implements ActionListener {
    JButton convertPound, convertCAD, convertYen;
    JTextField textBox1, textBox2;
    JLabel l1;
    public CurrencyConvert() {

        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 150);
        frame.setLocation(300, 200);

        l1=new JLabel("Enter Amount in Taka:");
        textBox1 = new JTextField(10);
        textBox1.setText(" ");

        convertPound = new JButton("Convert to Pound");
        convertCAD=new JButton("Convert to CAD");
        convertYen=new JButton("Convert to YEN");

        textBox2 = new JTextField(10);
        textBox2.setText(" ");





        convertPound.addActionListener(e -> {
            double value = Double.parseDouble(textBox1.getText()) / 119.875;



            textBox2.setText( value+ " Pound");

        });
        convertCAD.addActionListener(e -> {
            double value = Double.parseDouble(textBox1.getText()) / 70.082;

            textBox2.setText(value + " CAD");

        });
        convertYen.addActionListener(e -> {

            double value = Double.parseDouble(textBox1.getText()) / 0.773;

            textBox2.setText(value + " YEN");
        });















        JPanel panel = new JPanel();
        panel.add(l1);
        panel.add(textBox1);
        panel.add(convertPound);
        panel.add(convertCAD);
        panel.add(convertYen);

        panel.add(textBox2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
class Test55555555 {
    public static void main(String[] args) {
        new CurrencyConvert();
    }
}