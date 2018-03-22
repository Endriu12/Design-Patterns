package com.perepelitsya.builder;

import com.perepelitsya.builder.build.PersonBuilder;
import com.perepelitsya.builder.director.DirectorBuilder;
import com.perepelitsya.builder.model.Director;
import com.perepelitsya.builder.model.Doctor;
import com.perepelitsya.builder.model.Person;

public class Main {
    public static void main(String[] args) {
        DirectorBuilder directorBuilder = new DirectorBuilder();
        Director director = new Director();
//        Doctor doctor = new Doctor();
        directorBuilder.setPersonBuilder(director);
        directorBuilder.construct();
        Person personBuilder = directorBuilder.getPersonBuilder();
        System.out.println(personBuilder);
    }
}
