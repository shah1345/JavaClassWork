package CT3OOP;

import javax.swing.*;


 class AddressBook_GUI extends JFrame{
     AddressBook_GUI(){
        super();
        setTitle("Create Account");
        setSize(300,300);
        setLayout(null);
        JLabel nm = new JLabel("Name");
        JTextField nmtf = new JTextField(20);
        JLabel gen = new JLabel("Gender");
        JCheckBox ml = new JCheckBox("Male");
        JCheckBox fml = new JCheckBox("Female");
        JLabel note = new JLabel("Note");
        JTextArea nt = new JTextArea(5,10);
        JButton submit = new JButton("Create");
        JScrollPane jsp = new JScrollPane(nt,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        nm.setBounds(10, 20, 50, 20);
        add(nm);
        nmtf.setBounds(60, 20, 200, 20);
        add(nmtf);
        gen.setBounds(10, 50, 50, 20);
        add(gen);
        ml.setBounds(60, 50, 80, 20);
        add(ml);
        fml.setBounds(140, 50, 100, 20);
        add(fml);
        note.setBounds(10, 80, 40, 20);
        add(note);
        jsp.setBounds(60, 80, 200, 120);
        add(jsp);
        submit.setBounds(180, 210, 80, 20);
        add(submit);
        setVisible(true);
    }



    public static void main(String[] args) {


        new AddressBook_GUI();





    }





}
