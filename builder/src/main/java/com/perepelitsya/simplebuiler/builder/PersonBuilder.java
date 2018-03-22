package com.perepelitsya.simplebuiler.builder;

import com.perepelitsya.simplebuiler.model.Person;

public class PersonBuilder {
    int a = 18;
    String n = "";
    String p = "";
    int s = 3500;
    boolean m = false;
    boolean c = false;
    int ape = 0;

  public   PersonBuilder buildAge(int age) {
        this.a = age;
        return this;
    }

    public   PersonBuilder buildSalary(int salary) {
        this.s = salary;
        return this;
    }

    public  PersonBuilder buildCar(boolean car) {
        this.c = car;
        return this;
    }

    public PersonBuilder buildMarried(boolean married) {
        this.m = married;
        return this;
    }

    public  PersonBuilder buildAgeProfessionalExperience(int ageProfessionalExperience) {
        this.ape = ageProfessionalExperience;
        return this;
    }

    public  PersonBuilder buildName(String name) {
        this.n = name;
        return this;
    }

    public PersonBuilder buildProfesional(String profesional) {
        this.p = profesional;
        return this;
    }

    public  Person build() {
        Person person = new Person();
        person.setAge(a);
        person.setCar(c);
        person.setName(n);
        person.setAgeProfessionalExperience(ape);
        person.setSalary(s);
        person.setMarried(m);
        person.setProfession(p);
        return person;
    }
}
