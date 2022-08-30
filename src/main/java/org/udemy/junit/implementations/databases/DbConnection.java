package org.udemy.junit.implementations.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public String db;// = "genericDb";
    public String url;// = "jdbc:mysql://localhost/" + db + "?";
    public String user;// = "admin";
    public String pass;// = "1234";

    public DbConnection(String db, String user, String pass){
        super();
        this.db = db;
        this.user = user;
        this.pass = pass;
        this.url = "jdbc:mysql://localhost/" + db + "?";
    }

    public Connection getConnection() throws SQLException{
        Connection con = null;

        try{
            con = DriverManager.getConnection(this.url + "user=" + this.user + "&password=" + this.pass);
        }catch(SQLException e){
            e.printStackTrace();
        }

        return con;
    }
}
