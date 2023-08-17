package ATMinterface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class deposit extends JFrame implements ActionListener
{
    Container cn;
    JLabel t;
    JTextField dep_amt;
    JButton b1,b2,b3,b4;
    int balance;
    deposit(int balance)
    {
        this.balance =  balance;
        cn=getContentPane();
        setTitle("ATM Services");
        setLayout(null);
        cn.setBackground(Color.BLUE);
        t = new JLabel("Enter the amount to be deposited: ");
        t.setBounds(100,80,500,40);
        t.setFont(new Font("Arial",Font.BOLD,22));
        add(t);
        dep_amt = new JTextField("0");
        dep_amt.setBounds(100,150,300,40);
        dep_amt.setFont(new Font("Arial",Font.BOLD,22));
        add(dep_amt);
        b1 = new JButton("Deposit");
        b1.setBounds(550,400,250,50);
        b1.setFont(new Font("Arial",Font.BOLD,22));
        b1.addActionListener(this);
        cn.add(b1);
        b2 = new JButton("Back");
        b2.setBounds(550,470,250,50);
        b2.setFont(new Font("Arial",Font.BOLD,22));
        b2.addActionListener(this);
        cn.add(b2);
        setSize(800,600);
        setVisible(true);
        setLocation(280,100);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            String amt = dep_amt.getText();
            int n = Integer.parseInt(amt);
            if(n==0)
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid amount");
            }
            else
            {
                 balance = balance + n;
                JOptionPane.showMessageDialog(null, "Rs. "+n+" is deposited in your account. Your current balance is Rs. "+balance);
                dep_amt.setText("0");
            }
        }
        else if(ae.getSource() == b2)
        {
           setVisible(false); 
           new atm(balance).setVisible(true);
        }
    }
    public static void main(String args[])
    {   
        new deposit(0);
    }
}