package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseCon {
    public String url = "jdbc:mysql://localhost:3306/cyberagora_db?autoReconnect=true&useSSL=false";
    public String user = "root";
    public String password = "mypassword";
    public Connection myCon;

    public DatabaseCon(){
        try {
            myCon = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return myCon;
    }
}
