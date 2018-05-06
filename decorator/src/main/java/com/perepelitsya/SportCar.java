package com.perepelitsya;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by developer on 5/5/18.
 */
@Getter
@Setter
 class SportCar extends DecoratorCar {
    public SportCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void go() {
        super.go();
        System.out.println("Now i have nitroooo. Beeep-beeep-beep");
    }
}
