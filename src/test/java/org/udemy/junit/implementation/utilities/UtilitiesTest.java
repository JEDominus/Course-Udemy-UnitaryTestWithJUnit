package org.udemy.junit.implementation.utilities;

import org.junit.Before;
import org.junit.Test;
import org.udemy.junit.implementations.utilities.Utilities;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utilities;

    @Before
    public void setUp() {
        utilities = new Utilities();
    }

    @Test
    public void concatStringsTest() {
        //When (Execute logic to test)
        String result = utilities.concatStrings("Hello ", "World!");

        //Then (Validations)
        assertEquals("String are not equals", "Hello World!", result); //First parameter can be used as error message
    }

    @Test
    public void getArrayStringTest() {
        //Given
        String[] expected = {"uno", "dos", "tres"};

        //When
        String[] result = utilities.getArrayStrings("uno", "dos", "tres"); //Passing more than 1 param of string

        //Then
        //Comprobe whole array
        assertArrayEquals(expected, result);
        assertEquals(3, result.length);
        assertEquals(expected.length, result.length);
        //Compare each value with their position in the other array
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
        assertEquals(expected[2], result[2]);
        //Compare that values are not equals to the other
        assertNotEquals(expected[0], result[1]);
        assertNotEquals(expected[0], result[2]);
        assertNotEquals(expected[1], result[0]);
        assertNotEquals(expected[1], result[2]);
        assertNotEquals(expected[2], result[0]);
        assertNotEquals(expected[2], result[1]);
    }

    @Test
    public void isGraterThan10Test(){
        //When
        Boolean resultTrue = utilities.isGraterThan10(20);
        Boolean resultFalse = utilities.isGraterThan10(5);

        //Then
        assertTrue("Assert was fail for true", resultTrue);
        assertFalse("Assert was fail for false", resultFalse);
    }
}
