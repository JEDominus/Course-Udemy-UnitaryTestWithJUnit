package org.udemy.junit.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonTest { //Test class need to be "public"

    private Person person; //Declare the object/class to test

    @Before //Declares that the next method will be executed before the tests
    public void setup()
    {
        person = Person.builder() //Lombok builder to set object properties inline...
                .firstName("Javier")
                .lastName("Mota")
                .age(24)
                .isDeveloper(true)
                .build();
    }

    @Test //Declares a test case to execute
    public void testGetFirstName()
    {
        //Given
        //When
        //Then
        Assert.assertEquals(person.getFirstName(), "Javier"); //Assert that the property value be equals to the value given
        Assert.assertNotEquals(person.getFirstName(), "Emmanuel");
    }

    @Test
    public void testGetLastName()
    {
        //Given
        //When
        //Then
        Assert.assertEquals(person.getLastName(), "Mota");
        Assert.assertNotEquals(person.getLastName(), "Bayardo");
    }

    @Test
    public void testGetAge()
    {
        //Given
        //When
        //Then
        Assert.assertSame(person.getAge(), 24);
        Assert.assertNotSame(person.getAge(), 0);
    }

    @Test
    public void testGetIsDeveloper()
    {
        //Given
        //When
        //Then
        Assert.assertTrue(person.isDeveloper());
    }

    /*
    Assert.assertEquals(a, b);
    Assert.assertNotEquals(a, b);
    Assert.assertSame(a, b);
    Assert.assertNotSame(a, b);
    Assert.assertNull(a);
    Assert.assertNotNull(a);
    Assert.assertTrue(a);
    Assert.assertFalse(a);
    */
}
