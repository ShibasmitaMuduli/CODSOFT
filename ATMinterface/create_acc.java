package ATMinterface;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class create_acc extends JFrame implements ActionListener
{
    Random rand = new Random();
    long rac_no = rand.nextInt(1000000001);
    int rpin_no = rand.nextInt(10001);
    Container cn;
    JLabel id,pin,amount, type, t;
    JTextField inputId, inputPin, inputAmt;
    JRadioButton ca, sa;
    ButtonGroup bg;
    JButton submit;
    create_acc()
    {
        cn=getContentPane();
        setTitle("User Account");
        setLayout(null);
        t = new JLabel("** Please note the generated Account no. and Pin for future references.");
        t.setBounds(90,30,650,30);
        t.setForeground(Color.RED);
        t.setFont(new Font("Arial",Font.BOLD,18));
        add(t);
        id = new JLabel("GENERATED ACCOUNT NO. : "+rac_no);
        id.setBounds(150,90,500,40);
        id.setFont(new Font("Arial",Font.BOLD,20));
        add(id);
        pin = new JLabel("GENERATED PIN                   : "+rpin_no);
        pin.setBounds(150,160,500,40);
        pin.setFont(new Font("Arial",Font.BOLD,20));
        add(pin);
        type = new JLabel("ACCOUNT TYPE                    : ");
        type.setBounds(150,230,500,40);
        type.setFont(new Font("Arial",Font.BOLD,20));
        add(type);
        ca = new JRadioButton("Current Account");
        ca.setBounds(435,230,200,40);
        ca.setFont(new Font("Arial",Font.BOLD,20));
        add(ca);
        sa = new JRadioButton("Savings Account");
        sa.setBounds(435,260,200,40);
        sa.setFont(new Font("Arial",Font.BOLD,20));
        add(sa);
        bg = new ButtonGroup();
        bg.add(ca);
        bg.add(sa);
        amount = new JLabel("DEPOSIT AMOUNT                : ");
        amount.setBounds(150,330,300,40);
        amount.setFont(new Font("Arial",Font.BOLD,20));
        add(amount);
        inputAmt = new JTextField();
        inputAmt.setBounds(440,330,200,40);
        inputAmt.setFont(new Font("Arial",Font.BOLD,20));
        add(inputAmt);
        submit = new JButton("CREATE ACCOUNT");
        submit.setBounds(250,440,300,50);
        inputAmt.setFont(new Font("Arial",Font.BOLD,22));
        submit.addActionListener(this);
        add(submit);
        setSize(800,600);
        setVisible(true);
        setLocation(280,100);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==submit)
        {
            JOptionPane.showMessageDialog(null, "Account created successfully.");
            String amt = inputAmt.getText();
            int amnt = Integer.parseInt(amt);
            setVisible(false);
            new userlogin(rac_no,rpin_no,amnt).setVisible(true);
        }
    }
    public static void main(String args[])
    {   
        new create_acc();
    }
}