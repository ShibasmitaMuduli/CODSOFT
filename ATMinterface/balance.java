package ATMinterface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class balance extends JFrame implements ActionListener
{
    Container cn;
    JLabel t;
    JTextField cur_bal;
    JButton back;
    int balance;
    balance(int balance)
    {
        this.balance =  balance;
        cn=getContentPane();
        setTitle("ATM Services");
        setLayout(null);
        cn.setBackground(Color.BLUE);
        t = new JLabel("Current Balance:     "+balance);
        t.setBounds(250,220,400,40);
        t.setFont(new Font("Arial",Font.BOLD,22));
        add(t);
        back = new JButton("Back");
        back.setBounds(550,400,250,50);
        back.setFont(new Font("Arial",Font.BOLD,22));
        back.addActionListener(this);
        cn.add(back);
        setSize(800,600);
        setVisible(true);
        setLocation(280,100);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == back)
        {
           setVisible(false); 
           new atm(balance).setVisible(true);
        }
    }
    public static void main(String args[])
    {   
        new balance(0);
    }
}