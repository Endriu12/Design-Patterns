package com.perepelitsya.simplebuiler;

import com.perepelitsya.simplebuiler.builder.PersonBuilder;
import com.perepelitsya.simplebuiler.model.Person;

public class Main {
    public static void main(String[] args) {
//        Person kolya = new Person(21, "Mykola", "sanitar", 3500, false, true, 3);
//        System.out.println(kolya);

        //simple builder
        Person person = new PersonBuilder()
                .buildAge(19)
                .buildName("Andrii")
                .buildProfesional("Developer")
                .buildCar(true)
                .buildSalary(450)
                .build();
        System.out.println(person);

        //@Builder
//        Person andrii = Person.builder()
//                .age(19)
//                .name("Andrii")
//                .profession("Developer")
//                .ageProfessionalExperience(2)
//                .salary(450)
//                .married(true)
//                .car(true)
//                .build();
//        System.out.println(andrii);
    }
}
