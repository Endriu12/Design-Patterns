package com.perepelitsya.factory;

import com.perepelitsya.factory.model.Cat;
import com.perepelitsya.factory.model.Dog;
import com.perepelitsya.factory.service.IToyFactory;
import com.perepelitsya.factory.service.TeddyToyFactory;
import com.perepelitsya.factory.service.WoodenToyFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's start to get a gift from Santa!");
        //So we create a factory
        IToyFactory toyFactory = new WoodenToyFactory();
//        IToyFactory toyFactory = new TeddyToyFactory();
        Cat cat = toyFactory.getCat();
        Dog dog = toyFactory.getDog();
        System.out.println("I've got " + cat.getName() + " and " + dog.getName());
    }
}
