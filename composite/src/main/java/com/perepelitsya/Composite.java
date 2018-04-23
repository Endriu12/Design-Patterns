package com.perepelitsya;


import java.util.ArrayList;
import java.util.List;

//composite
public class Composite implements Person {

    private List<Person> people = new ArrayList<>();

    public void addComponent(Person person) {
        people.add(person);
    }

    public List<Person> getPersonList() {
        return people;
    }

    public void remove(Person person) {
        people.remove(person);
    }

    public void sayHelloWithName() {
        people.forEach(Person::sayHelloWithName);
    }
}
