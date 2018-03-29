package com.perepelitsya;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.PackagePrivate;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@PackagePrivate
@Getter
@Setter
public class Director implements Person {

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
        System.out.println("I am boss!!!!!!!!!! My name is  " + name);
    }
}
