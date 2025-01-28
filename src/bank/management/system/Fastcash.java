package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    Fastcash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(860,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMa_ge1 = new JLabel(i3);
        IMa_ge1.setBounds(0,0,860,600);
        add(IMa_ge1);

        JLabel label = new JLabel("Select withdrawl amount");
        label.setBounds(245,155,300,18);
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,17));
        IMa_ge1.add(label);

        b1 = new JButton("Rs. 100");
        b1.setBounds(230,198,100,22);
        b1.setFont(new Font("Raleway",Font.BOLD,12));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        IMa_ge1.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setBounds(345,198,125,22);
        b2.setFont(new Font("Raleway",Font.BOLD,12));
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        IMa_ge1.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setBounds(230,231,100,22);
        b3.setFont(new Font("Raleway",Font.BOLD,12));
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        IMa_ge1.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setBounds(345,231,125,22);
        b4.setFont(new Font("Raleway",Font.BOLD,12));
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        IMa_ge1.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setBounds(230,265,100,22);
        b5.setFont(new Font("Raleway",Font.BOLD,12));
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        IMa_ge1.add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setBounds(345,265,125,22);
        b6.setFont(new Font("Raleway",Font.BOLD,12));
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.white);
        b6.addActionListener(this);
        IMa_ge1.add(b6);

        b7 = new JButton("Back");
        b7.setBounds(230,300,100,22);
        b7.setFont(new Font("Raleway",Font.BOLD,12));
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
        if(e.getSource()==b7){
            new main_Class(pin);
            setVisible(false);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Con c = new Con();
            Date date = new Date();
            try {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));

                    }
                    else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));

                    }
                }String num = "17";
                if(e.getSource() != b7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"insufficient balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs." + amount + "Debited successfully");

            }catch (Exception E){

            }
            new main_Class(pin);
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Fastcash("");
    }


}
