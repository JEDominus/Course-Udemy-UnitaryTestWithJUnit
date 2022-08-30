package org.undemy.junit.utility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import org.udemy.junit.utility.UtilitiesParameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesParameterizedTest {

    @Parameters
    public static Collection<Object[]> datas(){
        return Arrays.asList(new Object[][]{
                {1,2},{3,5},{8,4},{1,8},{0,4},{1,10},
        });
    }

    private int v1;
    private int v2;
    private UtilitiesParameterized utility = new UtilitiesParameterized();

    public UtilitiesParameterizedTest(int val1, int val2){
        v1 = val1;
        v2 = val2;
    }

    @Test
    public void numbersAdditionTest(){
        System.out.println("Parameters are: " + v1 + ", " + v2);
        int result = utility.numbersAddition(v1, v2);
        assertEquals(v1 + v2, result);
        System.out.println("Result is: " + result);
    }

}
