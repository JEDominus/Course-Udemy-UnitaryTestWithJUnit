package org.undemy.junit.utility;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesParameterizedTest3 {

    @Parameters
    public static Object[] datas(){
        return new Object[] {"a","b","c"};
    }

    @Parameter
    public String val;

    @Test
    public void assignationTest(){
        System.out.println("Valor: ".concat(val));
        assertEquals(val, val);
    }
}
