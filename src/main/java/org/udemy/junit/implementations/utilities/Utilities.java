package org.udemy.junit.implementations.utilities;

public class Utilities {

    public String concatStrings(String a, String b)
    {
        if(a != null && b!= null){
            return a.concat(b);
        }

        return null;
    }

}
