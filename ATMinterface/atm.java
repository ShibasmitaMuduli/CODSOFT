package ATMinterface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class atm extends JFrame implements ActionListener
{
    Container cn;
    JLabel t;
    JButton b1,b2,b3,b4;
    int balance;
    atm(int balance)
    {
        this.balance = balance;
        cn=getContentPane();
        setTitle("ATM Services");
        setLayout(null);
        cn.setBackground(Color.BLUE);
        t = new JLabel("ATM SERVICES");
        t.setBounds(230,80,450,50);
        t.setFont(new Font("Arial",Font.BOLD,44));
        add(t);
        b1 = new JButton("Check Balance");
        b1.setBounds(0,220,250,60);
        b1.setFont(new Font("Arial",Font.BOLD,26));
        b1.addActionListener(this);
        cn.add(b1);
        b2 = new JButton("Withdraw");
        b2.setBounds(0,350,250,60);
        b2.setFont(new Font("Arial",Font.BOLD,26));
        b2.addActionListener(this);
        cn.add(b2);
        b3 = new JButton("Deposit");
        b3.setBounds(550,220,250,60);
        b3.setFont(new Font("Arial",Font.BOLD,26));
        b3.addActionListener(this);
        cn.add(b3);
        b4 = new JButton("Exit");
        b4.setBounds(550,350,250,60);
        b4.setFont(new Font("Arial",Font.BOLD,26));
        b4.addActionListener(this);
        cn.add(b4);
        setSize(800,600);
        setVisible(true);
        setLocation(280,100);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            setVisible(false);
            new balance(balance).setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
            setVisible(false);
            new withdraw(balance).setVisible(true);
        }
        else if(ae.getSource()==b3)
        {
            setVisible(false);
            new deposit(balance).setVisible(true);
        }
        else if(ae.getSource()==b4)
        {
            setVisible(false);
            new exit().setVisible(true);
        }
    }
    public static void main(String args[])
    {   
        new atm(0);
    }
}