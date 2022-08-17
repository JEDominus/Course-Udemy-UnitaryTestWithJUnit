package org.udemy.junit.implementation.utilities;

import org.junit.Assert;
import org.junit.Test;
import org.udemy.junit.implementations.utilities.Utilities;

public class UtilitiesTest {

    @Test
    public void testConcatStrings() //This test will be passed successfully
    {
        //Given (Instance the class)
        Utilities utilities = new Utilities();

        //When (Execute logic to test)
        String result = utilities.concatStrings("Hello ", "World!");

        //Then (Validations)
        Assert.assertEquals("String are not equals", "Hello World!", result); //First parameter can be used as error message
    }

    @Test
    public void testConcatStringsFail() //This method will fail 'cause string value difference
    {
        //Given (Instance the class)
        Utilities utilities = new Utilities();

        //When (Execute logic to test)
        String result = utilities.concatStrings("Bye Cruel ", "World!");

        //Then (Validations)
        Assert.assertEquals("String are not equals", "Hello World!", result); //First parameter can be used as error message
    }

    @Test
    public void testConcatStringsError() //This method will produce error because null value is passing as parameter when a String is spected
    {
        //Given (Instance the class)
        Utilities utilities = new Utilities();

        //When (Execute logic to test)
        String result = utilities.concatStrings(null, "World!");

        //Then (Validations)
        Assert.assertEquals("String are not equals", "Hello World!", result); //First parameter can be used as error message
    }
}
