package com.perepelitsya.proxy;


import com.perepelitsya.interfaces.GeneralInterface;
import com.perepelitsya.president.PresidentService;

import static java.util.Objects.isNull;


public class ProxyPresident implements GeneralInterface {

    public ProxyPresident(String name) {
        this.name = name;
    }

    PresidentService presidentService;

    String name;

    public void sayHello() {
        if (isNull(presidentService)) {
            presidentService = new PresidentService("Ivo Bobul");
        }

        presidentService.sayHello();
    }
}
