package org.undemy.junit.utility;

import static org.junit.Assert.assertEquals; //Library imported in a static way
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.udemy.junit.model.Person;
import org.udemy.junit.utility.PersonUtility;

public class PersonUtilityTest {

    private PersonUtility personUtility;

    @Before
    public void setUp(){
        personUtility = new PersonUtility();
    }

    @Test
    public void getJavierTest(){
        //When
        Person javier = personUtility.getJavier();

        //Then
        assertEquals("Javier", javier.getFirstName()); //Assert. there's not required by an static import
        assertEquals("Javier", personUtility.getJavier().getFirstName());
        assertEquals("Mota", javier.getLastName());
        assertEquals("Mota", personUtility.getJavier().getLastName());
    }

    @Test
    public void getNataliaTest(){
        //When
        Person natalia = personUtility.getNatalia();

        //Then
        assertEquals("Natalia", natalia.getFirstName());
        assertEquals("Natalia", personUtility.getNatalia().getFirstName());
        assertEquals("Martinez", natalia.getLastName());
        assertEquals("Martinez", personUtility.getNatalia().getLastName());
    }

    @Test
    public void differentPersonsTest(){
        //Then (With the methods fixed in Person class, this assert can comprobe if 2 objects are equals if has SAME NAME, NOT IS THE SAME OBJECT)
        assertNotEquals(personUtility.getJavier(), personUtility.getNatalia());
    }

}
