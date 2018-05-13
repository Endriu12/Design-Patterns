package com.perepelitsya.bridge;

public abstract class Car {

    protected DrawApi drawApi;

    protected Car (DrawApi  drawApi) {
        this.drawApi  = drawApi;
    }

    public abstract void draw();
}
