package org.udemy.junit.implementation.databases;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.udemy.junit.implementations.databases.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DbConnectionTest {
    private static final String BD = "genericdb";
    private static final String USER = "admin";
    private static final String PASS = "1234";
    private static final String INVALID_USER = "noAdmin";

    private DbConnection connection;

    @Test
    public void connectionSuccessfullyTest(){
        connection = new DbConnection(BD, USER, PASS);
        Connection con = null;

        try{
            con = connection.getConnection();
        }catch(SQLException e){
            fail("Database connection has failed");
        }

        assertThat(con, Matchers.notNullValue());
    }

    @Test
    public void connectionFailedTest(){
        connection = new DbConnection(BD, INVALID_USER, PASS);
        Connection con = null;

        try{
            con = connection.getConnection();
        }catch(SQLException e){
            assertThat(e, Matchers.isA(SQLException.class));
            assertThat(e.getMessage(), Matchers.startsWith("Access denied"));
            assertThat(e.getMessage(), Matchers.containsString("Access denied"));
            assertThat(e.getSQLState(), Matchers.is("28000"));
        }

        assertThat(con, Matchers.nullValue());
    }
}
