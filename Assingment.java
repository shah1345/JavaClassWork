
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class Assingment extends JFrame {
    private Container c;
    private JLabel t1;
    private Font f1,f2;
    int i;
    private JTextField b1;
    private JButton but1;
    Assingment(){
        frame();
        operation();
    }
    public void frame(){

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(60,60,600,600);
        setTitle("TOOGLE");
    }
    public void operation(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        t1=new JLabel("Enter your Alphabets and press toogle button :");
        t1.setBounds(50,50,400,100);
        f1=new Font("Arial",Font.BOLD,15);
        t1.setForeground(Color.BLACK);
        t1.setFont(f1);
        c.add(t1);
        b1=new JTextField(10);
        b1.setBounds(200,185,150,120);
        f2=new Font("Arial",Font.BOLD,20);
        b1.setFont(f2);
        c.add(b1);
        but1=new JButton("toogle");
        but1.setBackground(java.awt.Color.black);
        but1.setBounds(310,450,100,100);
        c.add(but1);
        action ac=new action();
        but1.addActionListener(ac);
    }
    class action implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            //  String s=b1.getText();
            //char [ ] cr=s.toCharArray();
            //if(cr[i]>=32 && cr[i]<=58){
            // cr[i].toString();





            String newtx = b1.getText();

            if(isStringUpperCase(b1.getText())){


                b1.setText(newtx.toLowerCase());

            } else  b1.setText(newtx.toUpperCase());




        }
    }
    public static void main(String[] args) {
        Assingment f=new Assingment();

    }





    private static boolean isStringUpperCase(String str){

        //convert String to char array
        char[] charArray = str.toCharArray();

        for(int i=0; i < charArray.length; i++){

            //if any character is not in upper case, return false
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }

        return true;
    }
















}