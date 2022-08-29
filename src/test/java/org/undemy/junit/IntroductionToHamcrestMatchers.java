package org.undemy.junit;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

public class IntroductionToHamcrestMatchers {

    @Test
    public void initialHamcrestExample(){
        String string = "Hello World";

        //Comparative
            //Without Hamcrest
        assertEquals("Hello World", string); //WO Hamcrest, first pass the string or value spected and after the object to evaluate
            //With Hamcrest - Is required use assertThat from JUnit
        assertThat(string, is(equalTo("Hello World")));//With Hamcrest, first pass object to evaluate and after the spected result

        //Equality
        assertThat(string, equalTo("Hello World"));
        assertThat(string, is(equalTo("Hello World")));

        assertThat(string, not(equalTo("Bye Cruel World")));
        assertThat(string, is(not(equalTo("Bye Cruel World"))));

        //Nullity
        assertThat(string, notNullValue());
        assertThat(string, is(notNullValue()));
        assertThat(string, is(not(nullValue())));
    }

}
