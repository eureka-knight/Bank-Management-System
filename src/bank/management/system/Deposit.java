package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton b1,b2;
    public Deposit(String pin){
        super();
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(860,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMa_ge1 = new JLabel(i3);
        IMa_ge1.setBounds(0,0,860,600);
        add(IMa_ge1);

        JLabel label1 = new JLabel("ENTER AMOUNT TO DEPOSIT");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,15));
        label1.setBounds(235,130,300,15);
        IMa_ge1.add(label1);

        textField = new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(235,160,230,20);
        textField.setFont(new Font("RALEWAY",Font.PLAIN,18));
        IMa_ge1.add(textField);

        b1 = new JButton("Deposit");
        b1.setBounds(360,230,100,22);
        b1.setFont(new Font("Raleway",Font.BOLD,16));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        IMa_ge1.add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(360,270,100,22);
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
        try{
            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource()==b1) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "insufficint money");
                } else {
                    Con c = new Con();
                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Deposit','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " +amount+ " Deposited successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            }else if(e.getSource()==b2) {
                setVisible(false);
                new main_Class(pin);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit("");
    }


}
