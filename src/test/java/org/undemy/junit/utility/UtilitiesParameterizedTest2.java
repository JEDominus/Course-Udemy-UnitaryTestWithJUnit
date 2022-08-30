package org.undemy.junit.utility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.udemy.junit.utility.UtilitiesParameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesParameterizedTest2 {

    @Parameterized.Parameters
    public static Collection<Object[]> datas(){
        return Arrays.asList(new Object[][]{
                {"a","b","c"},{"f","j","e"},{"v","d","s"},{"v","f","k"},{"i","t","c"}
        });
    }


    @Parameterized.Parameter(0) //Constructor variant
    public String v1;
    @Parameterized.Parameter(1)
    public String v2;
    @Parameterized.Parameter(2)
    public String v3;

    private UtilitiesParameterized utility = new UtilitiesParameterized();

    @Test
    public void concatStringsTest(){
        System.out.println("Parameters are: " + v1 + ", " + v2 + ", " + v3);
        String result = utility.concatStrings(v1, v2, v3);
        assertEquals(v1.concat(" ").concat(v2).concat(" ").concat(v3), result);
        System.out.println("Result is: " + result);
    }
}
