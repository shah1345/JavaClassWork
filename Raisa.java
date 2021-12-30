import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class Raisa {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Address Book");
        frame.setSize(500, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setLayout(new FlowLayout());

        JTextField name = new JTextField(25);
        JLabel Lname = new JLabel("Name");

        name.setBounds(200,20,200,30);
        Lname.setBounds(10,20,60,30);



        JTextField phone = new JTextField(11);
        JLabel Lphone = new JLabel("Phone");

        phone.setBounds(200,60,200,30);
        Lphone.setBounds(10,60,60,30);



        JTextField email = new JTextField(30);
        JLabel Lemail = new JLabel("Email");

        email.setBounds(200,100,200,30);
        Lemail.setBounds(10,100,60,30);


        JTextField address = new JTextField(50);
        JLabel Laddress = new JLabel("Address");

        address.setBounds(200,140,200,30);
        Laddress.setBounds(10,140,100,30);





        JTextField City = new JTextField(30);
        JLabel LCity = new JLabel("City");

        City.setBounds(200,180,200,30);
        LCity.setBounds(10,180,60,30);




        JButton saveButton = new JButton();
        JButton switchButton = new JButton();
        JTextField switchTf = new JTextField();


        saveButton.setBounds(10,250,120,40);

        JTextArea area=new JTextArea();
        area.setBounds(30,400,400,150);


        saveButton.setFont(new java.awt.Font("STZhongsong", 1, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(200, 20, 20));
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {


            }
        });

        switchTf.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N


        switchButton.setFont(new java.awt.Font("STZhongsong", 1, 18)); // NOI18N
        switchButton.setForeground(new java.awt.Color(200, 20, 20));
        switchButton.setText("SWITCH");
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               // switchButtonActionPerformed(evt);
            }
        });

















        JTextField result = new JTextField(15);



        JButton Add = new JButton("Convert");



        JLabel usd = new JLabel("USD");
        JLabel EURO = new JLabel("EURO");






        Add.setBounds(10,60,100,20);
        result.setBounds(10,100,200,30);
        EURO.setBounds(230,100,50,30);


        String brandscars[]={"US","BDT"};

        final JComboBox cb=new JComboBox(brandscars);

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lphone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lemail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Laddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        City.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LCity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N


        frame.add(name);
        frame.add(Lname);
        frame.add(phone);
        frame.add(Lphone);
        frame.add(email);
        frame.add(Lemail);
        frame.add(address);
        frame.add(Laddress);
        frame.add(City);
        frame.add(LCity);
        frame.add(saveButton);
        frame.add(area);


      //  frame.add(usd);
     //   frame.add(EURO);
      //  frame.add(cb);
      //  frame.add(Add);

      //  frame.add(result);

        frame.setLayout(null);


        frame.setVisible(true);


        Add.addActionListener(e -> {

          //  Double convertcur =  Integer.parseInt(inputA.getText()) * 0.88 ;


        //    result.setText(String.valueOf(convertcur));





        });


    /*    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {

            showTa.setText(""); // clears the text area
            ArrayList <People> arrList = new ArrayList<>();

            try{
                FileReader f = new FileReader("prac_data.txt");
                BufferedReader reader = new BufferedReader(f);

                String line;
                String delimeter = "###";

                while((line = reader.readLine()) != null){
                    String[] parts = line.split(delimeter);

                    String info = parts[0];
                    String name = parts[1];
                    int id = Integer.parseInt(parts[2]);
                    double marks = Double.parseDouble(parts[3]);

                    People p = new People(info, name,id,marks);

                    arrList.add(p);
                    System.out.println(p.name);
                }

                reader.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }

            // name, descending
            arrList.sort(new Comparator<People>(){
                @Override
                public int compare(People t, People t1) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    String n1 = t.name;
                    String n2 = t1.name;
                    return n2.compareTo(n1);
                }
            });

            for(int i = 0; i < arrList.size(); i++){
                People ref = arrList.get(i);
                String show = ref.info+ " " +ref.name + " " + ref.id + " " + ref.marks + "\n";
                showTa.append(show);
            }

        }

*/



    }


}