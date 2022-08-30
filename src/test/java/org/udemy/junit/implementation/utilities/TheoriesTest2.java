package org.udemy.junit.implementation.utilities;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesTest2 {

    @DataPoints
    public static String[] letters = {"a", "b", "c", "d", "e"};

    @DataPoint
    public static Integer num = 1;


    @Theory
    public void theoriesTest(String a, String b, String c, String d, String e, Integer num){
        System.out.println(a+b+c+d+e+num);
    }
}
