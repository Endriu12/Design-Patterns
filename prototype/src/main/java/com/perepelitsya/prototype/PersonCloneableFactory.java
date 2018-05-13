package com.perepelitsya.prototype;

//factory for creating people
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
