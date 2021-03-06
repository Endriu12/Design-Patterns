package com.perepelitsya.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.PackagePrivate;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@PackagePrivate
public class Trainee implements Person {

    String name;

    public void addComponent(Person person) {
        throw new UnsupportedOperationException("Dont impls");
    }

    public List<Person> getPersonList() {
        throw new UnsupportedOperationException("Dont impls");
    }

    public void remove(Person person) {
        throw new UnsupportedOperationException("Dont impls");

    }

    public void sayHelloWithName() {
        System.out.println("I am trainee " + name);
    }
}
