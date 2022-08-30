package org.udemy.junit.implementation.databases;

import org.junit.Assume;
import org.junit.Test;
import org.udemy.junit.implementations.databases.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class DbConnectionAssumptionsTest {

    private DbConnection connections;

    @Test public void assumptionTest() throws SQLException{

        connections = new DbConnection("asd", "asd", "asd");
        Connection con = null;

        try{
            con = connections.getConnection();
        }catch(SQLException e) {
            Assume.assumeNotNull(con); //Test ignored if con is null
        }
    }
}
