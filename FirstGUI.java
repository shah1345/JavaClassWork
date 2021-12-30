import javax.swing.*;
import java.awt.event.*;

public class FirstGUI {
    JTextField t;
    JButton c;
    JButton r;
    JTextArea area;

    String data = null;
    int price=0;

    public FirstGUI(){

        JFrame frame = new JFrame("CarShowRoom");
        final JLabel label = new JLabel();
        JTextField t1;

        t1=new JTextField();
        t1.setBounds(50,350, 300,30);
        t1.setVisible(false);

        int AudiCount=10,BMWCount=15,JackCount=35,PradeCount=65,PazaroCount=25;


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);

        label.setSize(400,100);
        JButton b=new JButton("Show");
        b.setBounds(200,10,75,20);

        JButton D=new JButton("Book");
        D.setBounds(300,10,75,20);


        String brandscars[]={"Audi","BMW","Jack","Prade","Pazaro"};

        final JComboBox cb=new JComboBox(brandscars);

        cb.setBounds(50, 10,120,20);

        area=new JTextArea();
        area.setBounds(50,100,300,200);


        frame.add(cb);
        frame.add(b);
        frame.add(D);
        frame.add(area);
        frame.add(t1);
        frame.setLayout(null);
        frame.setVisible(true);



        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(cb.getItemAt(cb.getSelectedIndex()).equals("Audi")){

                     data += "number of cars : " + AudiCount;
                     data+= "\nprice 200000$ \ncolors : RED ,Black \n";
                    data+="Features :\nBuilt on Volkswagen’s MQB platform \nbuilt with an intent to make luxury SUVs  \n";
                    area.setText(data);

                } else if(cb.getItemAt(cb.getSelectedIndex()).equals("BMW")){

                    data += "number of cars : " + BMWCount;
                    data+= "\nprice 200000$ \ncolors : RED ,Black \n";
                    data+="Features :\nBuilt on Volkswagen’s MQB platform \nbuilt with an intent to make luxury SUVs  \n";
                    area.setText(data);

                } else if(cb.getItemAt(cb.getSelectedIndex()).equals("Jack")){

                    data += "number of cars : " + JackCount;
                    data+= "\nprice 200000$ \ncolors : RED ,Black \n";
                    data+="Features :\nBuilt on Volkswagen’s MQB platform \nbuilt with an intent to make luxury SUVs  \n";
                    area.setText(data);

                } else if(cb.getItemAt(cb.getSelectedIndex()).equals("Prade")){

                    data += "number of cars : " + PradeCount;
                    data+= "\nprice 200000$ \ncolors : RED ,Black \n";
                    data+="Features :\nBuilt on Volkswagen’s MQB platform \nbuilt with an intent to make luxury SUVs  \n";
                    area.setText(data);

                } else if(cb.getItemAt(cb.getSelectedIndex()).equals("Pazaro")){

                    data += "number of cars : " + PazaroCount;
                    data+= "\nprice 200000$ \ncolors : RED ,Black \n";
                    data+="Features :\nBuilt on Volkswagen’s MQB platform \nbuilt with an intent to make luxury SUVs  \n";
                    area.setText(data);

                }


            }
        });

        D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String pricedata;

                if(cb.getItemAt(cb.getSelectedIndex()).equals("Audi")){
                    price+=100000;



                } else if(cb.getItemAt(cb.getSelectedIndex()).equals("BMW")){

                    price+=200000;

                } else if(cb.getItemAt(cb.getSelectedIndex()).equals("Jack")){

                    price+=300000;

                } else if(cb.getItemAt(cb.getSelectedIndex()).equals("Prade")){

                    price+=400000;

                } else if(cb.getItemAt(cb.getSelectedIndex()).equals("Pazaro")){

                    price+=500000;

                }

                pricedata= "Total amount due: " +price +" $";
                t1.setVisible(true);
                t1.setText(pricedata);
            }
        });


            }




    public static void main(String[] args){
        FirstGUI a = new FirstGUI();
    }
}