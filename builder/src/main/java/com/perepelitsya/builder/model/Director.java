package com.perepelitsya.builder.model;

import com.perepelitsya.builder.build.PersonBuilder;
import lombok.ToString;

@ToString
public class Director extends PersonBuilder {

    public void setAge() {
        person.age = 55;
    }

    public void setName() {
        person.name = "Stepan Aristocratovuch";
    }

    public void setProfession() {
        person.profession = "Chief of CHNU";
    }
}
