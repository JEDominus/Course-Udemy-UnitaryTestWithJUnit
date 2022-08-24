package org.udemy.junit.implementations.utilities;

public class Utilities {

    public String concatStrings(String a, String b)
    {
        if(a != null && b != null){
            return a.concat(b);
        }

        return null;
    }

    public String[] getArrayStrings(String ... strings){ //This definition means that the parameters can be multiple but the same data type (more than 1 string)
        String [] array = new String[strings.length];

        for(int  i = 0; i < strings.length; i++){
            array[i] = strings[i];
        }

        return array;
    }

}
