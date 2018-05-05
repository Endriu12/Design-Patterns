package com.perepelitsya;

/**
 * Created by developer on 5/5/18.
 */
public class Main {
    public static void main(String[] args) {
        final Mersedes myMersedes = new Mersedes();
        myMersedes.go();
        System.out.println("My mersedes, but i want to upgrate my car");

        final SportCar myUpgratedMersedes = new SportCar(myMersedes);
        myUpgratedMersedes.go();

    }
}
