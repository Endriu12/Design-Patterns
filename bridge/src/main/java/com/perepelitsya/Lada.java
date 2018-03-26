package com.perepelitsya;

public class Lada extends Car {

    protected Lada(DrawApi drawApi) {
        super(drawApi);
        drawApi.draw();
    }

    public void draw() {
        System.out.println("Lada");
    }
}
