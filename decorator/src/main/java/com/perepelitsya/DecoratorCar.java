package com.perepelitsya;

import lombok.Getter;
import lombok.Setter;

/**
 * This is a main class of patern.
 * It help us to upgrade functionality
 */
@Setter
@Getter
 class DecoratorCar extends  Car {
    protected Car decoratedCar;

    public DecoratorCar(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void go() {
        super.go();
    }
}
