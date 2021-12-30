package CT3OOP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;


class Address {
    String Name;
    String Phone;
    String Email;
    String Address;
    String City;


    public Address(String name, String phone, String email, String address, String city) {
        this.Name = name;
        this.Phone = phone;
        this.Email = email;
        this.Address = address;
        this.City = city;
    }


}


public class Raisa {

    private static Address[] address = new Address[100];

    private static ArrayList<Address> addresses = new ArrayList<Address>();

    private static int Records = 0;

    public static JTextField name = new JTextField(25);
    public static JTextField phone = new JTextField(11);
    public static JTextField email = new JTextField(30);
    public static JTextField Address = new JTextField(50);
    public static JTextField City = new JTextField(30);
    public static JTextField SearchBox = new JTextField(30);
    public static JTextArea area = new JTextArea();
    public static JScrollPane jsp = new JScrollPane(area,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);


    public static void main(String[] args) {
        JFrame frame = new JFrame("Address Book");
        frame.setSize(500, 800);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(new FlowLayout());

        JLabel Lname = new JLabel("Name");
        name.setBounds(200, 20, 200, 30);
        Lname.setBounds(10, 20, 60, 30);

        JLabel Lphone = new JLabel("Phone");
        phone.setBounds(200, 60, 200, 30);
        Lphone.setBounds(10, 60, 60, 30);

        JLabel Lemail = new JLabel("Email");
        email.setBounds(200, 100, 200, 30);
        Lemail.setBounds(10, 100, 60, 30);

        JLabel Laddress = new JLabel("Address");
        JLabel LSearch = new JLabel("Name / Number");
        Address.setBounds(200, 140, 200, 30);
        Laddress.setBounds(10, 140, 100, 30);

        JLabel LCity = new JLabel("City");
        City.setBounds(200, 180, 200, 30);
        LCity.setBounds(10, 180, 60, 30);
        JButton saveButton = new JButton();
        JButton editButton = new JButton();
        JButton SearchButton = new JButton();
        JButton switchButton = new JButton();
        JButton SEE = new JButton();
        JTextField switchTf = new JTextField();
        saveButton.setBounds(10, 250, 120, 40);
        editButton.setBounds(150, 250, 120, 40);
        SearchButton.setBounds(300, 250, 120, 40);
        SEE.setBounds(10, 300, 120, 40);
        SearchBox.setBounds(80, 300, 200, 30);
        LSearch.setBounds(10, 300, 80, 30);


        jsp.setBounds(30, 400, 400, 300);
        saveButton.setFont(new Font("STZhongsong", 1, 18));
        saveButton.setForeground(new Color(0, 98, 0));
        saveButton.setText("SAVE");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                Account_Create();
            }
        });

        editButton.setFont(new Font("STZhongsong", 1, 18));
        editButton.setForeground(new Color(0, 0, 255));
        editButton.setText("Edit");
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateAddress();
            }
        });

        SearchButton.setFont(new Font("STZhongsong", 1, 18));
        SearchButton.setForeground(new Color(128, 43, 49));
        SearchButton.setText("Search");
        SearchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SearchAddress();
            }
        });

        SEE.setFont(new Font("STZhongsong", 1, 18));
        SEE.setForeground(new Color(228, 73, 0));
        SEE.setText("SEE");
        SEE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ShowData();
            }
        });


//        switchTf.setFont(new Font("Tahoma", 3, 18));
//        switchButton.setFont(new Font("STZhongsong", 1, 18));
//        switchButton.setForeground(new Color(200, 20, 20));
//        switchButton.setText("See");
//        switchButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//            }
//        });
        JTextField result = new JTextField(15);
        JButton Add = new JButton("Convert");
        new JLabel("USD");
        JLabel EURO = new JLabel("EURO");
        Add.setBounds(10, 60, 100, 20);
        result.setBounds(10, 100, 200, 30);
        EURO.setBounds(230, 100, 50, 30);
        String[] brandscars = new String[]{"US", "BDT"};
        new JComboBox(brandscars);
        name.setFont(new Font("Tahoma", 1, 18));
        Lname.setFont(new Font("Tahoma", 1, 18));
        phone.setFont(new Font("Tahoma", 1, 18));
        Lphone.setFont(new Font("Tahoma", 1, 18));
        email.setFont(new Font("Tahoma", 1, 18));
        Lemail.setFont(new Font("Tahoma", 1, 18));
        Address.setFont(new Font("Tahoma", 1, 18));
        Laddress.setFont(new Font("Tahoma", 1, 18));
        City.setFont(new Font("Tahoma", 1, 18));
        LCity.setFont(new Font("Tahoma", 1, 18));

        SearchBox.setFont(new Font("Tahoma", 1, 18));
        LSearch.setFont(new Font("Tahoma", 1, 18));


        frame.add(name);
        frame.add(Lname);
        frame.add(phone);
        frame.add(Lphone);
        frame.add(email);
        frame.add(Lemail);
        frame.add(Address);
        frame.add(Laddress);
        frame.add(City);
        frame.add(LCity);
        frame.add(saveButton);
        frame.add(editButton);
        frame.add(SearchButton);
        frame.add(SEE);
        frame.add(jsp);
        frame.setLayout((LayoutManager) null);
        frame.setVisible(true);


        ShowData();


        Add.addActionListener((e) -> {
        });
    }


    static void Account_Create() {
        String data = "";
        int recourd_N = 1;

        for (int i = Records, j = 0; i < Records + recourd_N; i++, j++) {
            address[i] = new Address(name.getText(), phone.getText(), Address.getText(), email.getText(), City.getText());
            addresses.add(address[i]);
            data = name.getText() + "@@@" + phone.getText() + "@@@" + Address.getText() + "@@@" + email.getText() + "@@@" + City.getText();
        }
        Records += recourd_N;
        try {
            FileWriter fw = new FileWriter("src/CT3OOP/file.txt", true);
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

    static void UpdateAddress() {
        String data = "";
        int count = 0;
        if (!phone.getText().equals("")) {
            System.out.println("phone");
            for (Address address : addresses) {
                int difference = phone.getText().compareTo(address.Phone);
                if ((difference == 0)) {
                    break;
                }
                count++;
                System.out.println("break");
            }
            Address a = new Address(name.getText(), phone.getText(), Address.getText(), email.getText(), City.getText());
            addresses.set(count, a);
            try {
                PrintWriter writer = new PrintWriter("src/CT3OOP/file.txt");
                writer.print("");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (Address address : addresses) {
                data += address.Name + "@@@" + address.Phone + "@@@" + address.Address + "@@@" + address.Email + "@@@" + address.City + "\n";
            }
            try {
                FileWriter fw = new FileWriter("src/CT3OOP/file.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        address[1] = new Address(name.getText(), phone.getText(), Address.getText(), email.getText(), City.getText());
        System.out.println("Update Successful");
    }


    static void SearchAddress() {
        String data = "";
        if (!name.getText().equals("")) {
            System.out.println("name" + name.getText());
            for (Address address : addresses) {
                int difference = name.getText()
                        .toLowerCase(Locale.ROOT)
                        .compareTo(address.Name
                                .toLowerCase(Locale.ROOT));
                if ((difference <= 0 && difference > -18)) {
                    String part[] = name.getText().toLowerCase(Locale.ROOT).split(" ");
                    String part2[] = address.Name.toLowerCase(Locale.ROOT).split(" ");
                    if (part[0].equals(part2[0]) || difference > -2) {
                        data += "Name: " + address.Name + "\n" + "Phone: " + address.Phone + "\n" + "Address: " + address.Address + "\n" + "Email: " + address.Email + "\n" + "City: " +
                                address.City + "\n" + "\n" + "\n";
                    }
                }
                System.out.println(difference + " Name : " + address.Name);
            }
            area.setText(data);
        } else if (!phone.getText().equals("")) {
            System.out.println("phone");
            for (Address address : addresses) {
                int difference = phone.getText().toLowerCase(Locale.ROOT).compareTo(address.Phone.toLowerCase(Locale.ROOT));
                if ((difference == 0)) {
                    name.setText(address.Name);
                    Address.setText(address.Address);
                    City.setText(address.City);
                    email.setText(address.Email);
                    name.setText(address.Name);
                    data += "Name: " + address.Name + "\n" + "Phone: " + address.Phone + "\n" + "Address: " + address.Address + "\n" + "Email: " + address.Email + "\n" + "City: " +
                            address.City + "\n" + "\n" + "\n";
                }
            }
            area.setText(data);
        }
    }

    static void ShowData() {
        addresses.clear();
        String data = "";
        try {
            File Object = new File("src/CT3OOP/file.txt");
            Scanner Reader = new Scanner(Object);
            for (int i = 0; Reader.hasNextLine(); i++) {
                String Paris[] = Reader.nextLine().split("@@@");
                if (!Paris[0].equals("")) {
                    Address a = new Address(Paris[0], Paris[1], Paris[2], Paris[3], Paris[4]);
                    addresses.add(a);
                }
            }
            addresses.sort(new Comparator<CT3OOP.Address>() {
                @Override
                public int compare(CT3OOP.Address o1, CT3OOP.Address o2) {

                    String name1 = o1.Name;
                    String name2 = o2.Name;
                    return name1.compareTo(name2);
                }
            });
            for (Address address : addresses) {
                data += "Name: " + address.Name + "\n" + "Phone: " + address.Phone + "\n" + "Address: " + address.Address + "\n" + "Email: " + address.Email + "\n" + "City: " +
                        address.City + "\n" + "\n" + "\n";
            }



            area.setText(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
