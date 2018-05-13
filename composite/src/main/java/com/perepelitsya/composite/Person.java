package com.perepelitsya.composite;

import java.util.List;

//component
public interface Person {

    void addComponent(Person person);

    List<Person> getPersonList();

    void remove(Person person);

    void sayHelloWithName();

}
