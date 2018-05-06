package com.perepelitsya;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
 class Car {
    protected String brandName;

    public void go() {
        System.out.println("This is " + getBrandName());
    }

}
