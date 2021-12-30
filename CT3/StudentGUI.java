package CT3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


class StudentDatavase {
    String STname;
    String STid;
    double STGpa;

    public StudentDatavase(String STname, String STid, double STGpa) {
        this.STname = STname;
        this.STid = STid;
        this.STGpa = STGpa;
    }
}


public class StudentGUI {

    private static StudentDatavase[] Iteam = new StudentDatavase[100];

    private static ArrayList<StudentDatavase> iteamist = new ArrayList<StudentDatavase>();

    private static int Records = 0;

    public static JTextField name = new JTextField(25);
    public static JTextField phone = new JTextField(11);
    public static JTextField getGpa = new JTextField(30);

    public static JTextField Selectedgpa = new JTextField(30);

    public static JTextArea area = new JTextArea();


    public static JScrollPane jsp = new JScrollPane(area,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);


    public static void main(String[] args) {
        JFrame frame = new JFrame("Student App");
        frame.setSize(500, 800);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(new FlowLayout());

        JLabel Lname = new JLabel("Name");
        name.setBounds(200, 20, 200, 30);
        Lname.setBounds(10, 20, 100, 30);

        JLabel Lphone = new JLabel("ID");
        phone.setBounds(200, 60, 200, 30);
        Lphone.setBounds(10, 60, 100, 30);

        JLabel Lemail = new JLabel("GPA");
        getGpa.setBounds(200, 100, 200, 30);
        Lemail.setBounds(10, 100, 100, 30);

        JLabel Laddress = new JLabel("Selected-gpa");




        Selectedgpa.setBounds(200, 140, 200, 30);
        Laddress.setBounds(10, 140, 200, 30);






        JButton saveButton = new JButton();
        JButton editButton = new JButton();


        JButton SEE = new JButton();

        saveButton.setBounds(10, 250, 120, 40);


        SEE.setBounds(150, 250, 120, 40);





        jsp.setBounds(30, 400, 400, 300);


        saveButton.setFont(new Font("STZhongsong", 1, 18));
        saveButton.setForeground(new Color(0, 98, 0));
        saveButton.setText("Add");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                Account_Create();
            }
        });




        SEE.setFont(new Font("STZhongsong", 1, 18));
        SEE.setForeground(new Color(228, 73, 0));
        SEE.setText("Show");
        SEE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                ShowData();


            }
        });


        name.setFont(new Font("Tahoma", 1, 18));
        Lname.setFont(new Font("Tahoma", 1, 18));
        phone.setFont(new Font("Tahoma", 1, 18));
        Lphone.setFont(new Font("Tahoma", 1, 18));
        getGpa.setFont(new Font("Tahoma", 1, 18));
        Lemail.setFont(new Font("Tahoma", 1, 18));
        Selectedgpa.setFont(new Font("Tahoma", 1, 18));
        Laddress.setFont(new Font("Tahoma", 1, 18));



        frame.add(name);
        frame.add(Lname);
        frame.add(phone);
        frame.add(Lphone);
        frame.add(getGpa);
        frame.add(Lemail);
        frame.add(Selectedgpa);
        frame.add(Laddress);

        frame.add(saveButton);

        frame.add(SEE);


        frame.add(jsp);
        frame.setLayout((LayoutManager) null);
        frame.setVisible(true);


        ShowData();


    }

    static void Account_Create() {

        String data = "";


        int recourd_N = 1;


        for (int i = Records, j = 0; i < Records + recourd_N; i++, j++) {


            Iteam[i] = new StudentDatavase(name.getText(), phone.getText(), Double.parseDouble(getGpa.getText()));


            iteamist.add(Iteam[i]);


            data = name.getText() + "@@@" + phone.getText() + "@@@" + getGpa.getText();


        }

        Records += recourd_N;


        try {


            FileWriter fw = new FileWriter("src/CT3/Storedata.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.newLine();
            bw.close();

            System.out.println("Saved");

            ShowData();


        } catch (IOException e) {


            e.printStackTrace();
        }


    }




    static void ShowData() {

        iteamist.clear();

        String data = "";

        try {


            File Object = new File("src/CT3/Storedata.txt");
            Scanner Reader = new Scanner(Object);
            for (int i = 0; Reader.hasNextLine(); i++) {


                String Paris[] = Reader.nextLine().split("@@@");
                StudentDatavase a = new StudentDatavase(Paris[0], Paris[1], Double.parseDouble(Paris[2]));

                iteamist.add(a);


            }


            iteamist.sort(new Comparator<StudentDatavase>() {
                @Override
                public int compare(StudentDatavase o1, StudentDatavase o2) {
                    if (o1.STGpa > o2.STGpa) return -1;
                    if (o1.STGpa < o2.STGpa) return 1;
                    return 0;
                }
            });


            for (StudentDatavase Iteam : iteamist) {

                if(!Selectedgpa.getText().equals(""))
                    if(Double.parseDouble(Selectedgpa.getText())<=Iteam.STGpa){

                        data += "Name: " + Iteam.STname + "\n" + "ID: " + Iteam.STid + "\n" + "CGPA: " + Iteam.STGpa + "\n" + "\n" + "\n";

                    }




            }

            area.setText(data);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
