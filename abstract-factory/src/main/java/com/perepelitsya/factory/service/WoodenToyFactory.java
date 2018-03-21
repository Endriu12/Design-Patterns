package com.perepelitsya.factory.service;

import com.perepelitsya.factory.model.Cat;
import com.perepelitsya.factory.model.Dog;
import com.perepelitsya.factory.model.cat.WoodenCat;
import com.perepelitsya.factory.model.dog.WoodenDog;

public class WoodenToyFactory implements IToyFactory {

    @Override
    public Cat getCat() {
        return new WoodenCat();
    }

    @Override
    public Dog getDog() {
        return new WoodenDog();
    }
}
