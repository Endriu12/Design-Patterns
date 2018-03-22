package com.perepelitsya;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Person implements  Cloneable<Person>{
    int age;
    String name;

    public Person clone() {
        return new Person(age, name);
    }
}
