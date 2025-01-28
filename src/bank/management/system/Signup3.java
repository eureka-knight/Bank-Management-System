package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton btn1,btn2,btn3,btn4;
    String formno;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submit,cancel;
    public Signup3( String formno){
        super("APPLICATION FORM");
        this.formno = formno;

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image img2 = img1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel IMa_ge1 = new JLabel(img3);
        IMa_ge1.setBounds(50,5,70,70);
        add(IMa_ge1);

        JLabel l1 = new JLabel("Page 3");
        l1.setBounds(420,10,100,20);
        l1.setFont(new Font("Raleway",Font.BOLD,14));
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setBounds(180,40,220,20);
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("Account type :");
        l3.setBounds(50,100,150,20);
        l3.setFont(new Font("Raleway",Font.BOLD,16));
        add(l3);

        btn1 = new JRadioButton("Saving Account");
        btn1.setBounds(60,140,150,18);
        btn1.setFont(new Font("Raleway",Font.PLAIN,14));
        btn1.setBackground(new Color(215,252,252));
        add(btn1);

        btn2 = new JRadioButton("Fixed Deposit Account");
        btn2.setBounds(260,140,300,18);
        btn2.setFont(new Font("Raleway",Font.PLAIN,14));
        btn2.setBackground(new Color(215,252,252));
        add(btn2);

        btn3 = new JRadioButton("Current Account");
        btn3.setBounds(60,160,150,18);
        btn3.setFont(new Font("Raleway",Font.PLAIN,14));
        btn3.setBackground(new Color(215,252,252));
        add(btn3);

        btn4 = new JRadioButton("Recurring Deposit Account");
        btn4.setBounds(260,160,200,18);
        btn4.setFont(new Font("Raleway",Font.PLAIN,14));
        btn4.setBackground(new Color(215,252,252));
        add(btn4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(btn1);
        buttonGroup.add(btn2);
        buttonGroup.add(btn3);
        buttonGroup.add(btn4);

        JLabel l4 = new JLabel("Card Number :");
        l4.setBounds(50,220,150,20);
        l4.setFont(new Font("Raleway",Font.BOLD,16));
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit card number)");
        l5.setBounds(50,240,300,20);
        l5.setFont(new Font("Raleway",Font.PLAIN,12));
        add(l5);

        JLabel l6= new JLabel("XXXX-XXXX-XXXX-1234");
        l6.setBounds(230,220,200,20);
        l6.setFont(new Font("Raleway",Font.PLAIN,14));
        add(l6);

        JLabel l7 = new JLabel("(It would be appear on atm card or check Book)");
        l7.setBounds(230,240,400,20);
        l7.setFont(new Font("Raleway",Font.PLAIN,12));
        add(l7);

        JLabel l8 = new JLabel("Pin :");
        l8.setBounds(50,280,150,20);
        l8.setFont(new Font("Raleway",Font.BOLD,16));
        add(l8);

        JLabel l9 = new JLabel("(4-digit password)");
        l9.setBounds(50,300,300,20);
        l9.setFont(new Font("Raleway",Font.PLAIN,12));
        add(l9);

        JLabel l10 = new JLabel("XXXX");
        l10.setBounds(230,280,150,20);
        l10.setFont(new Font("Raleway",Font.PLAIN,14));
        add(l10);

        JLabel l11 = new JLabel("Services Required :");
        l11.setBounds(50,340,150,20);
        l11.setFont(new Font("Raleway",Font.BOLD,16));
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBounds(60,370,150,18);
        c1.setFont(new Font("Raleway",Font.PLAIN,14));
        c1.setBackground(new Color(215,252,252));
        add( c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(260,370,300,18);
        c2.setFont(new Font("Raleway",Font.PLAIN,14));
        c2.setBackground(new Color(215,252,252));
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(60,390,150,18);
        c3.setFont(new Font("Raleway",Font.PLAIN,14));
        c3.setBackground(new Color(215,252,252));
        add( c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBounds(260,390,300,18);
        c4.setFont(new Font("Raleway",Font.PLAIN,14));
        c4.setBackground(new Color(215,252,252));
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(60,410,150,18);
        c5.setFont(new Font("Raleway",Font.PLAIN,14));
        c5.setBackground(new Color(215,252,252));
        add( c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBounds(260,410,300,18);
        c6.setFont(new Font("Raleway",Font.PLAIN,14));
        c6.setBackground(new Color(215,252,252));
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declare that the above entered details correct by the my knowledge");
        c7.setBounds(50,460,440,18);
        c7.setFont(new Font("Raleway",Font.PLAIN,12));
        c7.setBackground(new Color(215,252,252));
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,15));
        submit.setBounds(150,500,90,20);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,15));
        cancel.setBounds(290,500,90,20);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(new Color(215, 252, 252));
        setLayout(null);
        setSize(520,580);
        setLocation(440,70);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String atype = null;
        if(btn1.isSelected()){
            atype = "Saving Account";
        } else if (btn2.isSelected()) {
            atype = "Fixed Deposit Account";

        } else if (btn3.isSelected()) {
            atype = "Current Account";

        } else if (btn4.isSelected()) {
            atype = "Recurring Deposit Account";

        }

        Random ran = new Random();
        long first16 =  1409963000000000L+ ran.nextLong(90000000L);
        String cardno = " " + Math.abs(first16);

        long first3 = 1000 + ran.nextLong(9000L);
        String pin = " " + Math.abs(first3);

        String facility = " ";
        if(c1.isSelected()){
            facility = facility + "ATM CARD";

        } else if (c2.isSelected()) {
            facility = facility + "Internet Banking";

        }else if (c3.isSelected()) {
            facility = facility + "Mobile Banking";

        }else if (c4.isSelected()) {
            facility = facility + "EMAIL Alerts";

        }else if (c5.isSelected()) {
            facility = facility + "Cheque Book";

        }else if (c6.isSelected()) {
            facility = facility + "E-Statement";

        }

        try {
            if(e.getSource()==submit){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"please fill all the fields");
                } else  {
                    Con con1 = new Con();
                    String query1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    con1.statement.executeUpdate(query1);
                    con1.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Your Account has been successfully created");
                    JOptionPane.showMessageDialog(null,"card number : " +cardno+ " \n pin : " +pin);
                    new Deposit(pin);
                    setVisible(false);
                    
                }
            } else if (e.getSource()==cancel) {
                System.exit(0);

            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }


}
