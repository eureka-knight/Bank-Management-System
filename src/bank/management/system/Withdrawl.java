package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;
    JTextField textField;
    JButton b1,b2;

    Withdrawl(String pin){
        this.pin= pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(860,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMa_ge1 = new JLabel(i3);
        IMa_ge1.setBounds(0,0,860,600);
        add(IMa_ge1);

        JLabel label1 = new JLabel("Maximum withdrawl is 10,000");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,12));
        label1.setBounds(235,130,300,12);
        IMa_ge1.add(label1);

        JLabel label2 = new JLabel("ENTER AMOUNT TO WITHDRAW");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,14));
        label2.setBounds(235,150,300,15);
        IMa_ge1.add(label2);

        textField = new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(235,180,230,20);
        textField.setFont(new Font("RALEWAY",Font.PLAIN,18));
        IMa_ge1.add(textField);

        b1 = new JButton("Withdraw");
        b1.setBounds(350,230,110,22);
        b1.setFont(new Font("Raleway",Font.BOLD,16));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        IMa_ge1.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(350,270,110,22);
        b2.setFont(new Font("Raleway",Font.BOLD,16));
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        IMa_ge1.add(b2);


        setSize(820,640);
        setLayout(null);
        setLocation(260,10);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
        try{

            String amount = textField.getText();
            Date date= new Date();
            if(textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"please enter amount");
            }else if(e.getSource()==b1){
                Con c = new Con();
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while (resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if(balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient amount");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs." +amount+ "Debited successfully");
                setVisible(false);
                new main_Class(pin);

            }

        }

        catch (Exception E) {
            E.printStackTrace();

        }}
        else if (e.getSource()== b2) {
            setVisible(false);
            new main_Class(pin);


        }

    }

    public static void main(String[] args) {
        new Withdrawl("");

    }


}
