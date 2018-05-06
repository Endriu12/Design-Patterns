package com.perepelitsya.prototype.factory.service;

import com.perepelitsya.prototype.factory.model.Cat;
import com.perepelitsya.prototype.factory.model.Dog;

public interface IToyFactory {

    Cat getCat();

    Dog getDog();

}
