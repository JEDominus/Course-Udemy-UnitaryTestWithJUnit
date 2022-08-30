package org.undemy.junit.utility;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class UtilitiesParameterizedTest4 {

    @Test
    @Parameters({"A,1","G,2","S,3","H,4","C,5"})
    public void parametersAnnotationTest(String chain, Integer num){
        System.out.println("String value is: " + chain + " " + num);
    }

}
