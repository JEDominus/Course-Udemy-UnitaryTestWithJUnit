package org.udemy.junit.implementations.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public final String db = "genericDb";
    public final String url = "jdbc:mysql://localhost/" + db + "?";
    public final String user = "admin";
    public final String pass = "1234";

    public Connection getConnection(){
        Connection con = null;

        try{
            con = DriverManager.getConnection(this.url + "user=" + this.user + "&password=" + this.pass);
        }catch(SQLException e){
            e.printStackTrace();
        }

        return con;
    }
}
