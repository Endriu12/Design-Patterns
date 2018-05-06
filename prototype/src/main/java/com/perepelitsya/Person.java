package com.perepelitsya;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
class Person implements  Cloneable<Person>{
    int age;
    String name;

    public Person clone() {
        return new Person(age, name);
    }
}
