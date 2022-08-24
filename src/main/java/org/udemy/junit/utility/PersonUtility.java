package org.udemy.junit.utility;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.udemy.junit.model.Person;

@Getter
public class PersonUtility {
    private Person javier;
    private Person natalia;

    public PersonUtility()
    {
        javier = Person.builder()
                .firstName("Javier")
                .lastName("Mota")
                .build();

        natalia = Person.builder()
                .firstName("Natalia")
                .lastName("Martinez")
                .build();
    }

    public Person[] getArrayPersons(){
        Person[] persons = {javier, natalia};
        return persons;
    }
}
