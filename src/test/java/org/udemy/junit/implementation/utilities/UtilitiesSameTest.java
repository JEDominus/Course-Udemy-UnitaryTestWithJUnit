package org.udemy.junit.implementation.utilities;

import org.junit.Before;
import org.junit.Test;
import org.udemy.junit.implementations.utilities.UtilitiesSame;
import org.udemy.junit.models.Person;

import static org.junit.Assert.*;

public class UtilitiesSameTest {

    private UtilitiesSame utility;

    @Before
    public void setUp(){
        utility = new UtilitiesSame();
    }

    @Test
    public void objectReturnerSuccessfullyTest(){
        //Given
        Person p = Person.builder().firstName("Javier").lastName("Mota").build();

        //When
        Person result = utility.objectReturner(p); //Method return the object found in the list

        //Then
        assertSame(p, result);
    }

    @Test
    public void objectReturnerFailedTest(){
        //Given
        Person p = Person.builder().firstName("Mark").lastName("Thompson").build();

        //When
        Person result = utility.objectReturner(p); //Method creates a new object and return it

        //Then
        assertNotSame(p, result);
    }

}
