package com.perepelitsya.factory;

import com.perepelitsya.Person;

public class PersonCloneableFactory {
    Person person;


    public PersonCloneableFactory(Person person) {
        setPrototype(person);
    }

    public void setPrototype(Person person) {
        this.person = person;
    }

    public Person copy() {
        return person.clone();
    }
}