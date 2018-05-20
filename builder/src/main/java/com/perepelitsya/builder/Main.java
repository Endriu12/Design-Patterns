package com.perepelitsya.builder;

import com.perepelitsya.builder.director.DirectorBuilder;
import com.perepelitsya.builder.model.Director;
import com.perepelitsya.builder.model.Doctor;
import com.perepelitsya.builder.model.Person;

public class Main {
    public static void main(String[] args) {
        DirectorBuilder directorBuilder = new DirectorBuilder();
//        Director director = new Director();
//        directorBuilder.setPersonBuilder(director);
        Doctor doctor = new Doctor();
        directorBuilder.setPersonBuilder(doctor);
        directorBuilder.construct();
        Person personBuilder = directorBuilder.getPersonBuilder();
        System.out.println(personBuilder);
    }
}
