package org.udemy.junit.implementation.utilities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.udemy.junit.implementations.utilities.UtilitiesNull;
import org.udemy.junit.models.Person;

public class UtilitiesNullTest {
    private UtilitiesNull utility;

    @Before
    public void setUp(){
        utility = new UtilitiesNull();
    }

    @Test
    public void giveMePersonTest(){
        //When
        Person personA = utility.giveMePerson("Javier");
        Person personNull = utility.giveMePerson("Rodrick");

        //Then
        assertNull("Person found, result is not null", personNull);
        assertNotNull("Person not found, result is null", personA);
    }
}
