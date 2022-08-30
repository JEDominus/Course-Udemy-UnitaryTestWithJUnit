package org.udemy.junit.implementation.databases;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.udemy.junit.implementations.databases.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.assertThat;

public class DbConnectionTest {

    private DbConnection connection;

    @Before
    public void setUp(){
        //connection = new DbConnection();
    }

    @Test @Ignore
    public void dbConnectionFail() throws SQLException { //Test the correct db connection
        Connection con = connection.getConnection();

        if(con == null){ //If connection doesn't exist, trigger the test fail
            Assert.fail("DB Connection failed");
        }else{ //But if connection is not null, then assert with JUnit and Hamcrest
            assertThat(con, Matchers.notNullValue());
        }
    }
}
