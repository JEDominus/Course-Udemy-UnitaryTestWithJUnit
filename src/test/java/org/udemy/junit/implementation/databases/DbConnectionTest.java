package org.udemy.junit.implementation.databases;

import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.udemy.junit.implementations.databases.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DbConnectionTest {
    private static final String BD = "genericdb";
    private static final String USER = "admin";
    private static final String PASS = "1234";
    private static final String INVALID_USER = "noAdmin";

    @Rule //Is necesary annotate with rule  the expected exception
    public ExpectedException exception = ExpectedException.none();

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

    @Test(expected = SQLException.class) @Ignore
    public void connectionFailed2Test() throws SQLException{
        connection = new DbConnection(BD, INVALID_USER, PASS);
        connection.getConnection();
    }

    @Test @Ignore
    public void connectionFailed3Test() throws SQLException{
        //This rule catchs the expetions
        exception.expect(SQLException.class); //This line is necessary in each method
        exception.expectMessage("Access denied");//Using substring, NOT ENTIRE STRING REQUIRED
        exception.expectMessage(Matchers.equalTo("Access denied for user 'noAdmin'@'localhost' (using password: YES)"));//Using Matchers
        exception.expectMessage(Matchers.containsString("Access denied"));//Using Matchers
        exception.expectMessage(Matchers.endsWith("(using password: YES)"));//Using Matchers

        connection = new DbConnection(BD, INVALID_USER, PASS);
        connection.getConnection();
    }
}
