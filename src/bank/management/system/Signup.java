package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
public class Signup extends JFrame implements ActionListener {
    JButton next;
    JRadioButton btn1,btn2,btn3,btn4;
    JTextField text_Name,text_Fname,text_email, text_address, text_pin,text_city,text_state,text_country;
    JDateChooser datechooser;
    Random ran = new Random();
    int first4Digit = 1000 + ran.nextInt(9000);
//    String first = " " + Math.abs(first4Digit); this can be also used
      String first = Integer.toString(first4Digit);
//    String first = String.valueOf(first4Digit); this can be also used


    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMa_ge1 = new JLabel(i3);
        IMa_ge1.setBounds(10,10,70,70);
        add(IMa_ge1);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(100, 37,290,25);
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setLocation(370,10);
        label2.setSize(60,17);
        label2.setFont(new Font("Raleway",Font.BOLD,13));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(150,65,250,20);
        label3.setFont(new Font("Raleway",Font.BOLD,17));
        add(label3);

        JLabel label_Name = new JLabel("Name :");
        label_Name.setBounds(30,110,100,17);
        label_Name.setFont(new Font("Raleway",Font.BOLD,16));
        add(label_Name);

        text_Name = new JTextField();
        text_Name.setFont(new Font("Raleway",Font.BOLD,16));
        text_Name.setBounds(160,110,200,20);
        add(text_Name);

        JLabel label_fname = new JLabel("Father's Name :");
        label_fname.setBounds(30,140,140,15);
        label_fname.setFont(new Font("Raleway",Font.BOLD,15));
        add(label_fname);

        text_Fname = new JTextField();
        text_Fname.setFont(new Font("Raleway",Font.BOLD,16));
        text_Fname.setBounds(160,140,200,20);
        add(text_Fname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setBounds(30,170,140,15);
        DOB.setFont(new Font("Raleway",Font.BOLD,15));
        add(DOB);

        datechooser = new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(160,170,200,20);
        add(datechooser);

        JLabel Gender = new JLabel("Gender :");
        Gender.setBounds(30,200,200,20);
        Gender.setFont(new Font("Raleway",Font.BOLD,15));
        add( Gender);

        btn1 = new JRadioButton("Male");
        btn1.setBounds(160,200,60,20);
        btn1.setFont(new Font("Raleway",Font.PLAIN,15));
        btn1.setBackground(new Color(222,255,228));
        add(btn1);

        btn2 = new JRadioButton("Female");
        btn2.setBounds(255,200,90,20);
        btn2.setFont(new Font("Raleway",Font.PLAIN,15));
        btn2.setBackground(new Color(222,255,228));
        add(btn2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(btn1);
        buttonGroup1.add(btn2);

        JLabel label_email = new JLabel("Email address :");
        label_email.setFont(new Font("Raleway",Font.BOLD,15));
        label_email.setBounds(30,230,140,15);
        add(label_email);

        text_email = new JTextField();
        text_email.setBounds(160,230,200,20);
        text_email.setFont(new Font("Raleway",Font.PLAIN,15));
        add(text_email);

        JLabel married_status = new JLabel("Married status :");
        married_status.setBounds(30,260,120,20);
        married_status.setFont(new Font("Raleway",Font.BOLD,15));
        add(married_status);

        btn3 = new JRadioButton("Married");
        btn3.setBounds(160,260,100,20);
        btn3.setFont(new Font("Raleway",Font.PLAIN,15));
        btn3.setBackground(new Color(222,255,228));
        add(btn3);

        btn4 = new JRadioButton("Unmarried");
        btn4.setBounds(260,260,130,20);
        btn4.setFont(new Font("Raleway",Font.PLAIN,15));
        btn4.setBackground(new Color(222,255,228));
        add(btn4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(btn3);
        buttonGroup2.add(btn4);

        JLabel label_address = new JLabel("Address :");
        label_address.setBounds(30,290,100,17);
        label_address.setFont(new Font("Raleway",Font.BOLD,15));
        add(label_address);

        text_address = new JTextField();
        text_address.setFont(new Font("Raleway",Font.PLAIN,15));
        text_address.setBounds(160,290,200,20);
        add( text_address);

        JLabel label_city = new JLabel("City :");
        label_city.setBounds(30,320,60,17);
        label_city.setFont(new Font("Raleway",Font.BOLD,15));
        add( label_city);

        text_city = new JTextField();
        text_city.setFont(new Font("Raleway",Font.PLAIN,15));
        text_city.setBounds(160,320,200,20);
        add(text_city);

        JLabel label_pin = new JLabel("Pin code :");
        label_pin.setBounds(30,350,110,17);
        label_pin.setFont(new Font("Raleway",Font.BOLD,15));
        add( label_pin);

        text_pin = new JTextField();
        text_pin.setFont(new Font("Raleway",Font.PLAIN,15));
        text_pin.setBounds(160,350,200,20);
        add(  text_pin);

        JLabel label_state = new JLabel("State :");
        label_state.setBounds(30,380,70,17);
        label_state.setFont(new Font("Raleway",Font.BOLD,15));
        add(  label_state);

        text_state = new JTextField();
        text_state.setFont(new Font("Raleway",Font.PLAIN,15));
        text_state.setBounds(160,380,200,20);
        add(text_state);

        JLabel label_country = new JLabel("Country :");
        label_country.setBounds(30,410,70,17);
        label_country.setFont(new Font("Raleway",Font.BOLD,15));
        add(  label_country);

        text_country = new JTextField();
        text_country.setFont(new Font("Raleway",Font.PLAIN,15));
        text_country.setBounds(160,410,200,20);
        add(text_country);

        next = new JButton("Next");
        next.setBounds(310,470,70,20);
        next.setFont(new Font("Raleway",Font.BOLD,15));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(520,580);
        setLocation(440,70);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = text_Name.getText();
        String fname = text_Fname.getText();
        String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String gender =  null;
        if(btn1.isSelected()){
            gender="Male";
        }else if(btn2.isSelected()){
            gender = "Female";

        }
        String email = text_email.getText();
        String married = null;
        if(btn3.isSelected()){
            married = "married";
        } else if (btn4.isSelected()) {
            married = "unmarried";

        }
        String address = text_address.getText();
        String city = text_city.getText();
        String pin = text_pin.getText();
        String state = text_state.getText();
        String country = text_country.getText();

        try{
            if(text_Name.getText().equals("")){
                JOptionPane.showMessageDialog(null,"something is missing please fill the form");
            }else {
                Con con1 = new Con();
                String query  = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+ gender+"','"+email+"','"+married+"','"+address+"','"+city+"','"+pin+"','"+state+"','"+country+"')";
                con1.statement.executeUpdate(query);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Signup();


    }


}
