package org.udemy.junit;

import org.junit.*;

public class MainTest {

    @BeforeClass //This method will be executed BEFORE ALL test method... Need to be STATIC
    public static void setUpBeforeClass(){ //This method usually are used to CONNECT with databases
        System.out.println("Executing Method: Before Class\n");
    }

    @Before //This method will be executed BEFORE EACH test method
    public void setUp(){ //This method usually are used to CREATE and POPULATE objects
        System.out.println("Executing Method: Before");
    }

    @Test
    public void test1()
    {
        System.out.println("Executing Method: Test 1");
    }

    @Test
    public void test2()
    {
        System.out.println("Executing Method: Test 2");
    }

    @After //This method will be executed AFTER EACH test method
    public void tearDown(){
        System.out.println("Executing Method: After \n");
    }

    @AfterClass //This method will be executed AFTER ALL test method... Need to be STATIC
    public static void tearDownAfterClass(){ //This method usually are used to DISCONNECT with databases
        System.out.println("Executing Method: After Class");
    }

}
