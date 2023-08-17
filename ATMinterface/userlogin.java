package ATMinterface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class userlogin extends JFrame implements ActionListener
{
    Container cn;
    JLabel id,pin,t;
    JTextField inputId, inputPin;
    JButton signin, signup;
    long acc;
    int pinn,balance;
    userlogin(long acc,int pinn, int amnt)
    {
        this.acc = acc;
        this.pinn = pinn;
        balance = amnt;
        cn = getContentPane();
        setTitle("User Login");
        setLayout(null);
        cn.setBackground(Color.BLUE);
        t = new JLabel("WELCOME TO ATM");
        t.setBounds(200,80,450,50);
        t.setFont(new Font("Arial",Font.BOLD,44));
        add(t);
        id = new JLabel("ACCOUNT NO: ");
        id.setBounds(150,200,200,50);
        id.setFont(new Font("Arial",Font.BOLD,26));
        add(id);
        inputId = new JTextField();
        inputId.setBounds(350,200,300,40);
        inputId.setFont(new Font("Arial",Font.BOLD,26));
        add(inputId);
        pin = new JLabel("PIN: ");
        pin.setBounds(150,270,200,50);
        pin.setFont(new Font("Arial",Font.BOLD,26));
        add(pin);
        inputPin = new JTextField();
        inputPin.setBounds(350,270,300,40);
        inputPin.setFont(new Font("Arial",Font.BOLD,26));
        add(inputPin);
        signin = new JButton("SIGN IN");
        signin.setBounds(350,380,125,50);
        signin.addActionListener(this);
        add(signin);
        signup = new JButton("SIGN UP");
        signup.setBounds(525,380,125,50);
        signup.addActionListener(this);
        add(signup);
        setSize(800,600);
        setVisible(true);
        setLocation(280,100);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==signin)
        {
            String acc_no = inputId.getText();
            long m = Integer.parseInt(acc_no);
            String pin_no = inputPin.getText();
            int n = Integer.parseInt(pin_no);
            if(m == acc && n == pinn)
            {
                JOptionPane.showMessageDialog(null, "Login Successful");
                setVisible(false);
                new atm(balance).setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid credentials. Please try again.");
            }
            
        }
        else if(ae.getSource()==signup)
        {
            setVisible(false);
            new signup().setVisible(true);
        }
    }
    public static void main(String args[])
    {   
        new userlogin(0,0,0);
    }
}