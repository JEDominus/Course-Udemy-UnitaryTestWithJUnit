package org.udemy.junit.implementation.utilities;

import org.junit.Assert;
import org.junit.Test;
import org.udemy.junit.implementations.utilities.Utilities;

public class UtilitiesTest {

    @Test
    public void testConcatStrings()
    {
        //Given (Instance the class)
        Utilities utilities = new Utilities();

        //When (Execute logic to test)
        String result = utilities.concatStrings("Hello ", "World!");

        //Then (Validations)
        Assert.assertEquals("String are not equals", "Hello World!", result); //First parameter can be used as error message
    }
}
