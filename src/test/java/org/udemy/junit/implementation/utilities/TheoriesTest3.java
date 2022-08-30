package org.udemy.junit.implementation.utilities;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesTest3 {

    @DataPoints
    public static int[] nums = {1,2,3,4,5,6,7,8,9,0};

    @Theory
    public void theoryTest(int num1, int num2){
        System.out.println("Combinations: " + num1 + " --- " + num2);
    }

}
