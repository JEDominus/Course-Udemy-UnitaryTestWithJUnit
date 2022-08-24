package org.udemy.junit.implementations.utilities;

import lombok.Getter;
import org.udemy.junit.models.Person;

import java.util.ArrayList;
import java.util.List;

@Getter
public class UtilitiesNull {

    private List<Person> persons;

    public UtilitiesNull(){
        persons = new ArrayList<>();
        persons.add(Person.builder().firstName("Javier").lastName("Mota").build());
        persons.add(Person.builder().firstName("Natalia").lastName("Manzo").build());
        persons.add(Person.builder().firstName("Erik").lastName("Bayardo").build());
    }

    public Person giveMePerson(String name){
        Person p = null;

        for(Person person : persons){ //For loop for a list ... <Item> : <Array to take items>
            if(person.getFirstName().equalsIgnoreCase(name)){
                p = person;
            }
        }

        return p;
    }

}
