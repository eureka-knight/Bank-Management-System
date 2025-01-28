package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formno;
    JButton next;
    JRadioButton btn1,btn2,btn3,btn4;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4, comboBox5;
    JTextField text_Pan,text_Adhar;

    Signup2(String formno){

        super("APPLICATION FORM");

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image img2 = img1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel IMa_ge1 = new JLabel(img3);
        IMa_ge1.setBounds(50,5,70,70);
        add(IMa_ge1);

        this.formno= formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setBounds(420,10,100,20);
        l1.setFont(new Font("Raleway",Font.BOLD,14));
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(180,60,220,20);
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,15));
        l3.setBounds(50,110,100,17);
        add(l3);

        String religion[] = {"Hindu","Muslim","Christian","Budhism","Sikh","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,78));
        comboBox.setFont(new Font("Raleway",Font.PLAIN,14));
        comboBox.setBounds(200,110,260,20);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,15));
        l4.setBounds(50,150,100,17);
        add(l4 );

        String category[] = {"General","OBC","ST","SC","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,78));
        comboBox2.setFont(new Font("Raleway",Font.PLAIN,14));
        comboBox2.setBounds(200,150,260,20);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,15));
        l5.setBounds(50,190,100,17);
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,78));
        comboBox3.setFont(new Font("Raleway",Font.PLAIN,14));
        comboBox3.setBounds(200,190,260,20);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway",Font.BOLD,15));
        l6.setBounds(50,230,100,17);
        add(l6);

        String educational[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrait","Other"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,78));
        comboBox4.setFont(new Font("Raleway",Font.PLAIN,14));
        comboBox4.setBounds(200,230,260,20);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,15));
        l7.setBounds(50,270,100,17);
        add(l7);

        String occupation[] = {"salaried","self-Employed","Business","student","Retired","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,78));
        comboBox5.setFont(new Font("Raleway",Font.PLAIN,14));
        comboBox5.setBounds(200,270,260,20);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,15));
        l8.setBounds(50,310,130,17);
        add(l8);

        text_Pan = new JTextField();
        text_Pan.setBackground(new Color(252,208,78));
        text_Pan.setFont(new Font("Raleway",Font.PLAIN,14));
        text_Pan.setBounds(200,310,260,20);
        add(text_Pan);

        JLabel l9 = new JLabel("Adhaar Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,15));
        l9.setBounds(50,350,200,17);
        add(l9);

        text_Adhar = new JTextField();
        text_Adhar.setBackground(new Color(252,208,78));
        text_Adhar.setFont(new Font("Raleway",Font.PLAIN,14));
        text_Adhar.setBounds(200,350,260,20);
        add(text_Adhar);

        JLabel l10= new JLabel("Senior citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,15));
        l10.setBounds(50,390,200,17);
        add(l10);

        btn1 = new JRadioButton("Yes");
        btn1.setFont(new Font("Raleway",Font.BOLD,15));
        btn1.setBackground(new Color(143,133,16));
        btn1.setBounds(200,390,100,14);
        add(btn1);

        btn2 = new JRadioButton("No");
        btn2.setFont(new Font("Raleway",Font.BOLD,15));
        btn2.setBackground(new Color(143,133,16));
        btn2.setBounds(300,390,100,14);
        add(btn2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(btn1);
        buttonGroup1.add(btn2);

        JLabel l11= new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,15));
        l11.setBounds(50,430,200,17);
        add(l11);

        btn3 = new JRadioButton("Yes");
        btn3.setFont(new Font("Raleway",Font.BOLD,15));
        btn3.setBackground(new Color(143,133,16));
        btn3.setBounds(200,430,100,14);
        add(btn3);

        btn4 = new JRadioButton("No");
        btn4.setFont(new Font("Raleway",Font.BOLD,15));
        btn4.setBackground(new Color(143,133,16));
        btn4.setBounds(300,430,100,14);
        add(btn4);

        ButtonGroup buttongroup2 = new ButtonGroup();
        buttongroup2.add(btn3);
        buttongroup2.add(btn4);

        JLabel l12= new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,22));
        l12.setBounds(180,30,160,22);
        add(l12);

        JLabel l13= new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,22));
        l13.setBounds(290,30,160,22);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,15));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.setBounds(370,470,70,18);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(143, 133, 16));
        setLayout(null);
        setSize(520,580);
        setLocation(440,70);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String ocu = (String) comboBox5.getSelectedItem();

        String pan =  text_Pan.getText();
        String aadhar = text_Adhar.getText();

        String scitizen = null;
        if(btn1.isSelected()){
            scitizen = "Yes";
        }else if(btn2.isSelected()){
            scitizen = "No";
        }

        String eAccount = null;
        if(btn3.isSelected()){
            eAccount = "Yes";
        } else if (btn4.isSelected()) {
            eAccount = "No";

        }

        try{
            if(text_Pan.getText().equals("") || text_Adhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the field");
            }else {
                Con c1 = new Con();
                String query = "insert into signuptwo values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+ocu+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(query);
                new Signup3(formno);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
     new Signup2("");
    }


}
