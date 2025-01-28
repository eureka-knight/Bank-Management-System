package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    main_Class( String pin){
        this.pin= pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(860,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMa_ge1 = new JLabel(i3);
        IMa_ge1.setBounds(0,0,860,600);
        add(IMa_ge1);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(235,150,300,16);
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,15));
        IMa_ge1.add(label);

        b1 = new JButton("Deposit");
        b1.setBounds(230,198,100,22);
        b1.setFont(new Font("Raleway",Font.BOLD,10));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        IMa_ge1.add(b1);

        b2 = new JButton("Cash Withdraw");
        b2.setBounds(345,198,125,22);
        b2.setFont(new Font("Raleway",Font.BOLD,10));
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        IMa_ge1.add(b2);

        b3 = new JButton("Fast Cash");
        b3.setBounds(230,231,100,22);
        b3.setFont(new Font("Raleway",Font.BOLD,10));
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        IMa_ge1.add(b3);

        b4 = new JButton("Mini Statement");
        b4.setBounds(345,231,125,22);
        b4.setFont(new Font("Raleway",Font.BOLD,10));
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        IMa_ge1.add(b4);

        b5 = new JButton("Pin Change");
        b5.setBounds(230,265,100,22);
        b5.setFont(new Font("Raleway",Font.BOLD,10));
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        IMa_ge1.add(b5);

        b6 = new JButton("Balance Enquiry");
        b6.setBounds(345,265,125,22);
        b6.setFont(new Font("Raleway",Font.BOLD,10));
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.white);
        b6.addActionListener(this);
        IMa_ge1.add(b6);

        b7 = new JButton("Exit");
        b7.setBounds(230,300,100,22);
        b7.setFont(new Font("Raleway",Font.BOLD,10));
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.white);
        b7.addActionListener(this);
        IMa_ge1.add(b7);

        setSize(820,640);
        setLayout(null);
        setLocation(260,10);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);

        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);

        } else if (e.getSource()==b3) {
            new Fastcash(pin);
            setVisible(false);

        } else if (e.getSource()==b4) {
            new Mini(pin);

        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);

        } else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);


        } else if(e.getSource()==b7){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
