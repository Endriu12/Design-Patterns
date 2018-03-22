package com.perepelitsya.simplebuiler.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
//@Builder
@Setter
@ToString
public class Person {
    int age;
    String name;
    String profession;
    int salary;
    boolean married = false;
    boolean car = false;
    int ageProfessionalExperience;
}
