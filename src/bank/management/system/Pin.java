package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {

    String pin;
    JTextField textField1,textField2;
    JButton b1,b2;
    JPasswordField passwordField1,passwordField2;

    Pin(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(860,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMa_ge1 = new JLabel(i3);
        IMa_ge1.setBounds(0,0,860,600);
        add(IMa_ge1);

        JLabel label1 = new JLabel("Change Your Pin");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD,15));
        label1.setBounds(235,120,300,17);
        IMa_ge1.add(label1);

        JLabel label2 = new JLabel("New PIN :");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,12));
        label2.setBounds(235,145,300,12);
        IMa_ge1.add(label2);

        passwordField1 = new JPasswordField();
        passwordField1.setBackground(new Color(65,125,128));
        passwordField1.setForeground(Color.white);
        passwordField1.setBounds(350,145,110,20);
        passwordField1.setFont(new Font("RALEWAY",Font.PLAIN,18));
        IMa_ge1.add( passwordField1);

        JLabel label3 = new JLabel("Re-Enter New PIN :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("System",Font.BOLD,12));
        label3.setBounds(235,175,300,13);
        IMa_ge1.add(label3);

        passwordField2 = new JPasswordField();
        passwordField2.setBackground(new Color(65,125,128));
        passwordField2.setForeground(Color.white);
        passwordField2.setBounds(350,175,110,20);
        passwordField2.setFont(new Font("RALEWAY",Font.PLAIN,18));
        IMa_ge1.add(passwordField2);

        b1 = new JButton("Change");
        b1.setBounds(350,230,110,22);
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        IMa_ge1.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(350,263,110,22);
        b2.setFont(new Font("Raleway",Font.BOLD,14));
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
            String pin1 = passwordField1.getText();
            String pin2 = passwordField2.getText();

            if(e.getSource()==b1){
                if(passwordField1.getText().equals("") && passwordField2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Oops something is missing");
                    return;
                }if(!pin1.equals(pin2)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN doesn't match");
                    return;
                }
                Con c = new Con();
                String query1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String query2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String query3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(query1);
                c.statement.executeUpdate(query2);
                c.statement.executeUpdate(query3);

                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                setVisible(false);
                new main_Class(pin);

            } else if (e.getSource()==b2) {
                new main_Class(pin);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Pin("");

    }


}
