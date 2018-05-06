package com.perepelitsya.prototype.factory;

import com.perepelitsya.prototype.factory.model.Cat;
import com.perepelitsya.prototype.factory.model.Dog;
import com.perepelitsya.prototype.factory.service.IToyFactory;
import com.perepelitsya.prototype.factory.service.TeddyToyFactory;
import com.perepelitsya.prototype.factory.service.WoodenToyFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's start to get a gift from Santa!");
        //So we create a factory
//        IToyFactory toyFactory = new WoodenToyFactory();
        IToyFactory toyFactory = new TeddyToyFactory();
        Cat cat = toyFactory.getCat();
        Dog dog = toyFactory.getDog();
        System.out.println("I've got " + cat.getName() + " and " + dog.getName());
    }
}
