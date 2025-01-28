package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JLabel label2;
    JButton b1;
    String pin;

    BalanceEnquiry( String pin){
        this.pin= pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(860,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMa_ge1 = new JLabel(i3);
        IMa_ge1.setBounds(0,0,860,600);
        add(IMa_ge1);

        JLabel label1 = new JLabel("Your current balance is Rs.");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,15));
        label1.setBounds(245,150,300,16);
        IMa_ge1.add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(245,175,300,15);
        IMa_ge1.add(label2);

        b1 = new JButton("Back");
        b1.setBounds(350,230,110,22);
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        IMa_ge1.add(b1);

        int balance = 0;
        try{
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText("" + balance);


        setSize(820,640);
        setLayout(null);
        setLocation(260,10);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);

    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }


}
