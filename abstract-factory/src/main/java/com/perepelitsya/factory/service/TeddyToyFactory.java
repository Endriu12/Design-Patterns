package com.perepelitsya.prototype.factory.service;

import com.perepelitsya.prototype.factory.model.Cat;
import com.perepelitsya.prototype.factory.model.Dog;
import com.perepelitsya.prototype.factory.model.cat.TeddyCat;
import com.perepelitsya.prototype.factory.model.dog.TeddyDog;

public class TeddyToyFactory implements IToyFactory {

    public Cat getCat() {
        return new TeddyCat();
    }

    public Dog getDog() {
        return new TeddyDog();
    }
}
