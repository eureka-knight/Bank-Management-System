package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {
    JButton b1;
    JScrollPane scrollPane;
    JPanel panel;
    JLabel label1, label2, label3, label4;
    String pin;

    Mini(String pin) {
//        pin = "2032"; // Hardcoded for demonstration; use this.pin for dynamic input
        this.pin= pin;

        // Set up the main frame
        setTitle("eureka_knight APP");
        setSize(320, 400);
        setLayout(null);
        getContentPane().setBackground(new Color(236,220,174));
//        setLocationRelativeTo(null); // Center on screen
        setLocation(466,137);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/provider.png"));
        Image i2 = i1.getImage().getScaledInstance(45,40,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel IMa_ge1 = new JLabel(i3);
        IMa_ge1.setBounds(210,5,45,40);
        add(IMa_ge1);

        // Create labels
        label1 = new JLabel("eureka_knight");
        label1.setBounds(60, 15, 200, 24);
        label1.setFont(new Font("System", Font.BOLD, 20));
        add(label1);

        label2 = new JLabel();
        label2.setBounds(20, 50, 300, 15);
        label2.setFont(new Font("System", Font.BOLD, 14));
        add(label2);

        // Create a JLabel for displaying transaction history
        label3 = new JLabel();
        label3.setFont(new Font("System", Font.PLAIN, 12));
        label3.setVerticalAlignment(JLabel.TOP); // Align text at the top

        // Wrap the label in a JScrollPane
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Stack components vertically
        panel.setBackground(new Color(236,220,174));
        panel.add(label3);


        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(10, 80, 290, 180); // Adjusted width and height for better visibility
        add(scrollPane);

        label4 = new JLabel();
        label4.setBounds(20, 270, 250, 20);
        label4.setFont(new Font("System", Font.BOLD, 15));
        add(label4);

        // Exit button
        b1 = new JButton("Exit");
        b1.setBounds(40, 320, 70, 18);
        b1.setFont(new Font("Raleway", Font.BOLD, 15));
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        add(b1);

        // Fetch and display account information
        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM login WHERE pin = " + pin);
            while (resultSet.next()) {
                String str1 = "Card Number: " + resultSet.getString("card_number").substring(0, 4) + "XXXXXXXX" + resultSet.getString("card_number").substring(12);
                label2.setText(str1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Fetch transaction history
        try {
            int balance = 0;
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM bank WHERE pin = " + pin);
            StringBuilder history = new StringBuilder("<html>"); // Use StringBuilder for efficient string concatenation

            while (resultSet.next()) {
                String str2 = resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br>";
                history.append(str2); // Append transaction info to history

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            history.append("</html>"); // Close the HTML tag
            label3.setText(history.toString()); // Set the transaction history in the JLabel
            label4.setText("Your total balance is Rs " + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure application exits properly
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setVisible(false); // Close the window
        }
    }

    public static void main(String[] args) {
        new Mini("");
    }
}




