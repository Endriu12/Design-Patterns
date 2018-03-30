package com.perepelitsya.factory.service;

import com.perepelitsya.factory.model.Cat;
import com.perepelitsya.factory.model.Dog;
import com.perepelitsya.factory.model.cat.TeddyCat;
import com.perepelitsya.factory.model.dog.TeddyDog;

public class TeddyToyFactory implements IToyFactory {

    public Cat getCat() {
        return new TeddyCat();
    }

    public Dog getDog() {
        return new TeddyDog();
    }
}
