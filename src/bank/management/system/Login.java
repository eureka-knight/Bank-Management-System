package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.foreign.AddressLayout;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;

    Login(){
        super("Bank Management System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMa_ge1 = new JLabel(i3);
        IMa_ge1.setBounds(365,10,80,80);
        add(IMa_ge1);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel IMa_ge2 = new JLabel(ii3);
        IMa_ge2.setBounds(585,365,80,80);
        add(IMa_ge2);

        label1 = new JLabel("WELCOME TO THE UNIVERSAL BANK");
        label1.setForeground(Color.white);
        label1.setFont(new Font("avantgarde",Font.BOLD,25));
        label1.setBounds(200,50,520,130);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway",Font.BOLD,20));
        label2.setBounds(230,100,180,100);
        add(label2);

        textField2 = new JTextField(16);
        textField2.setBounds(320,135,200,30);
        textField2.setFont(new Font("ARIAL",Font.BOLD,20));
        add(textField2);

        label3 = new JLabel("Pin:");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway",Font.BOLD,20));
        label3.setBounds(230,140,170,100);
        add(label3);

        passwordField3 = new JPasswordField(17);
        passwordField3.setBounds(320,180,200,30);
        passwordField3.setFont(new Font("ARIAL",Font.BOLD,20));
        add(passwordField3);

        button1 = new JButton("sign in");
        button1.setForeground(Color.white);
        button1.setFont(new Font("ARIAL",Font.BOLD,20));
        button1.setBackground(Color.black);
        button1.setBounds(320,230,100,25);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("clear");
        button2.setForeground(Color.white);
        button2.setFont(new Font("ARIAL",Font.BOLD,20));
        button2.setBackground(Color.black);
        button2.setBounds(430,230,90,25);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("sign up");
        button3.setForeground(Color.white);
        button3.setFont(new Font("ARIAL",Font.BOLD,20));
        button3.setBackground(Color.black);
        button3.setBounds(320,270,200,25);
        button3.addActionListener(this);
        add(button3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel IMa_ge3 = new JLabel(iii3);
        IMa_ge3.setBounds(0,0,850,480);
        add(IMa_ge3);


        setLayout(null);
        setSize(850,480);
        setLocation(260,120);
//        setUndecorated(false); this cause upper symbol will be disappear
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Con c = new Con();
        String cardno = textField2.getText().trim();
        String pin = passwordField3.getText().trim();


        String q = "SELECT * FROM login WHERE card_number = "+cardno+" AND pin = "+pin;
        try{
            if(e.getSource()==button1){
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);

                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"invalid card number or pin number");
                }

            }else if(e.getSource()==button2){
                textField2.setText("");
                passwordField3.setText("");

            }else if (e.getSource()==button3){
                new Signup();
                setVisible(false);

            }

        }

        catch (Exception E){
            E.printStackTrace();

        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
