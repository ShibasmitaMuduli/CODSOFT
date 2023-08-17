package ATMinterface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class signup extends JFrame implements ActionListener
{
    Container cn;
    JLabel name, dob, gender, address, adharno, t;
    JRadioButton m, f, o;
    ButtonGroup bg;
    JTextField info1,info2, info3;
    JPasswordField info4;
    JButton submit;
    signup()
    {
        cn=getContentPane();
        setTitle("New User SignUp");
        setLayout(null);
        t = new JLabel("USER APPLICATION FORM");
        t.setBounds(200,40,400,50);
        t.setFont(new Font("Arial",Font.BOLD,30));
        add(t);
        name = new JLabel("NAME: ");
        name.setBounds(100,130,250,40);
        name.setFont(new Font("Arial",Font.BOLD,20));
        add(name);
        info1 = new JTextField();
        info1.setBounds(400,130,300,40);
        info1.setFont(new Font("Arial",Font.BOLD,20));
        add(info1);
        dob = new JLabel("DOB (dd-mm-yyyy): "); 
        dob.setBounds(100,190,250,40);
        dob.setFont(new Font("Arial",Font.BOLD,20));
        add(dob);
        info2 = new JTextField();
        info2.setBounds(400,190,300,40);
        info2.setFont(new Font("Arial",Font.BOLD,20));
        add(info2);
        gender = new JLabel("GENDER: ");
        gender.setBounds(100,250,250,40);
        gender.setFont(new Font("Arial",Font.BOLD,20));
        add(gender);
        m = new JRadioButton("Male");
        m.setBounds(400,250,100,40);
        m.setFont(new Font("Arial",Font.BOLD,20));
        add(m);
        f = new JRadioButton("Female");
        f.setBounds(500,250,100,40);
        f.setFont(new Font("Arial",Font.BOLD,20));
        add(f);
        o = new JRadioButton("Others");
        o.setBounds(600,250,100,40);
        o.setFont(new Font("Arial",Font.BOLD,20));
        add(o);
        bg = new ButtonGroup();
        bg.add(m);
        bg.add(f);
        bg.add(o);
        address = new JLabel("ADDRESS: ");
        address.setBounds(100,310,250,40);
        address.setFont(new Font("Arial",Font.BOLD,20));
        add(address);
        info3 = new JTextField();
        info3.setBounds(400,310,300,40);
        info3.setFont(new Font("Arial",Font.BOLD,20));
        add(info3);
        adharno = new JLabel("AADHAR NUMBER: ");
        adharno.setBounds(100,370,250,40);
        adharno.setFont(new Font("Arial",Font.BOLD,20));
        add(adharno);
        info4 = new JPasswordField();
        info4.setBounds(400,370,300,40);
        info4.setFont(new Font("Arial",Font.BOLD,20));
        add(info4);
        submit = new JButton("Submit");
        submit.setBounds(300,460,200,50);
        submit.setFont(new Font("Arial",Font.BOLD,22));
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
            setVisible(false);
            new create_acc().setVisible(true);
        }
    }
    public static void main(String args[])
    {   
        new signup();
    }
}