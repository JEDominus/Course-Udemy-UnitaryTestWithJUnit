package org.udemy.junit.implementations.utilities;

import org.udemy.junit.models.Person;

import java.util.ArrayList;
import java.util.List;

public class UtilitiesSame {
    private List<Person> persons;

    public UtilitiesSame(){
        persons = new ArrayList<>();
        persons.add(Person.builder().firstName("Javier").lastName("Mota").build());
        persons.add(Person.builder().firstName("Natalia").lastName("Manzo").build());
    }

    public Person objectReturner(Person person){//If object exist in list, return the object,m else, create a new object
        if(persons.contains(person)){ //Method comprobe if object is null or takes as equals
            return person;
        }else{
            return Person.builder().firstName("Erik").lastName("Bayardo").build();
        }
    }
}
