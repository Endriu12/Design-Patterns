package com.perepelitsya.bridge;

class Main {
    public static void main(String[] args) {
        Car car = new Audi(new Red());
        car.draw();

        Lada lada = new Lada(new Green());
        lada.draw();

        Lada lad = new Lada(new Yellow());
        lada.draw();

        Lada qwe = new Lada(new Red());
        qwe.draw();
    }
}
