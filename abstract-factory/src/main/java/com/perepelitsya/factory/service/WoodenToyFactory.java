package com.perepelitsya.prototype.factory.service;

import com.perepelitsya.prototype.factory.model.Cat;
import com.perepelitsya.prototype.factory.model.Dog;
import com.perepelitsya.prototype.factory.model.cat.WoodenCat;
import com.perepelitsya.prototype.factory.model.dog.WoodenDog;

public class WoodenToyFactory implements IToyFactory {

    public Cat getCat() {
        return new WoodenCat();
    }

    public Dog getDog() {
        return new WoodenDog();
    }
}
