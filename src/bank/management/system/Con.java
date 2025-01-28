package bank.management.system;

import java.sql.*;


public class Con {
    String url = "jdbc:mysql://127.0.0.1:3306/bank_system";
    String user = "root";
    String password = "amar@123";
    Statement statement;
    Connection connection;
    public Con(){
        try{
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
