package com.perepelitsya.builder.model;

import com.perepelitsya.builder.build.PersonBuilder;
import lombok.ToString;

@ToString
public class Doctor extends PersonBuilder {
    public void setAge() {
        person.age = 25;
    }

    public void setName() {
        person.name = "Aibolit";
    }

    public void setProfession() {
        person.profession = "anesthetist";
    }
}
