package ATMinterface;
import java.awt.*;
import javax.swing.*;

public class exit extends JFrame
{
    Container cn;
    JLabel t1, t2, t3, bg;
    ImageIcon img;
    exit()
    {
        cn=getContentPane();
        setTitle("ATM Services");
        setLayout(null);
        t1 = new JLabel("Thank you");
        t1.setBounds(220,90,400,80);
        t1.setFont(new Font("Arial",Font.BOLD,70));
        add(t1);
        t2 = new JLabel("for using ATM Services.");
        t2.setBounds(130,220,600,55);
        t2.setFont(new Font("Arial",Font.BOLD,48));
        add(t2);
        t3 = new JLabel("Please collect your Card.");
        t3.setBounds(100,320,700,60);
        t3.setFont(new Font("Arial",Font.BOLD,52));
        add(t3);
        setSize(800,600);
        setVisible(true);
        setLocation(280,100);
    }
    public static void main(String args[])
    {   
        new exit();
    }
}