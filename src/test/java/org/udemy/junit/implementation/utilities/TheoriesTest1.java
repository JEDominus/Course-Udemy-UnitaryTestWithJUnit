package org.udemy.junit.implementation.utilities;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesTest1 {

    @DataPoint
    public static String a = "a";

    @DataPoint
    public static String b = "b";

    //Theory test all possible combinations of datapoints
    //Are common used in math and stadistics (Permutations)
    @Theory //Similar of @Test
    public void theoriesTest(String first, String second){
        System.out.println("Combination: " + first + " and " + second);
    }
}
