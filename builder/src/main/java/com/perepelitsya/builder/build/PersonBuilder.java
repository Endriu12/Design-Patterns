package com.perepelitsya.builder.build;

import com.perepelitsya.builder.model.Person;
import lombok.ToString;

@ToString
public abstract class PersonBuilder {
   protected Person person;
    public void createPerson(){
        person = new Person();
    }

    public Person getPerson() {
        return person;
    }

    public abstract void setAge();
    public abstract void setName();
    public abstract void setProfession();
}
