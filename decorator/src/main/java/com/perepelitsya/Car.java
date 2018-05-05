package com.perepelitsya;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    protected String brandName;

    public void go() {
        System.out.println("This is " + getBrandName());
    }

}
