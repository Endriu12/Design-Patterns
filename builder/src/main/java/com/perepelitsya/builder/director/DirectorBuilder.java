package com.perepelitsya.builder.director;

import com.perepelitsya.builder.build.PersonBuilder;
import com.perepelitsya.builder.model.Person;
import lombok.Getter;
import lombok.Setter;

@Setter
public class DirectorBuilder {

    public Person getPersonBuilder() {
        return personBuilder.getPerson();
    }

    PersonBuilder personBuilder;

    public void construct(){
        personBuilder.createPerson();
        personBuilder.setAge();
        personBuilder.setName();
        personBuilder.setProfession();
    }


}
