package com.perepelitsya;

import com.perepelitsya.factory.ComputerFactory;
import com.perepelitsya.model.Computer;

public class Main {
    public static void main(String[] args) {
        //you choose what type of computer you want
//        String whatComputeYouWant = "Laptop";
        String whatComputeYouWant = "PC";


        Computer computer = ComputerFactory.getProduct(whatComputeYouWant);
        computer.doSomething();
    }
}