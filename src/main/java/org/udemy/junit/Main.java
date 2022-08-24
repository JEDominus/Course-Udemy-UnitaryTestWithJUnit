package org.udemy.junit;

import org.udemy.junit.model.Person;

public class Main {
    public static void main(String[] args) {
        //Primitives
        int a = 5;
        int b = 20;

        System.out.println("Primitives -> " + (a == b)); //FALSE: data types equals && values different
        a = b;
        System.out.println("Primitives -> " + (a == b)); //TRUE: data types equals && values equals

        //Objects
        Person personA = Person.builder()
                .firstName("Javier")
                .lastName("Mota")
                .build();

        Person personB = Person.builder()
                .firstName("Natalia")
                .lastName("Manzo")
                .build();

        System.out.println("Persons -> " + (personA == personB)); //FALSE: data  types equals && values different
        personB.setFirstName(personA.getFirstName());
        personB.setLastName(personA.getLastName());
        System.out.println("Persons -> " + (personA == personB)); //FALSE: data types equals && values equals && instances different -- FALSE (different java memory space)
        System.out.println("Persons -> " + (personA.equals(personB))); //FALSE: same case above - Only equals if are the SAME OBJECT IN MEMORY
        //TRUE: If override the hashcode and equals method in person class

    }
}