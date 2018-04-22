package com.perepelitsya;

import com.perepelitsya.factory.PersonCloneableFactory;

public class Main {

    public static void main(String[] args) {
        Person person = new Person(1, "Andrii");
        System.out.println(person.toString());

        System.out.println("Our clone");
        Person clone = person.clone();
        System.out.println(clone.toString());


        PersonCloneableFactory factory = new PersonCloneableFactory(person);
        //We set person to factory for make more clone
        Person person1 = factory.copy();
        person1.setName("Ми можемо міняти в залежносітого як ми хочемо  ");
        System.out.println(person1.toString());

        //also now we can set prototype and make clone

        factory.setPrototype(new Person(45, "I. Mask"));
        for (int i = 0; i < 10; i++) {
            Person ilon = factory.copy();
            System.out.println(ilon.toString());

        }
        //for now we have 10 Ilon Mask

    }
}
