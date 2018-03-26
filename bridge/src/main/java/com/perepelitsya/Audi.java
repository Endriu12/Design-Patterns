package com.perepelitsya;

public class Audi extends Car {
    protected Audi(DrawApi drawApi) {
        super(drawApi);
        drawApi.draw();
    }

    public void draw() {
        System.out.println("Audi");
    }
}
