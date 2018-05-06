package com.perepelitsya.prototype.factory;

import com.perepelitsya.model.Computer;
import com.perepelitsya.model.Laptop;
import com.perepelitsya.model.PC;

public class ComputerFactory {
    public static Computer getProduct(String typeOfComputer) {
        if (typeOfComputer.contains("PC")) {
            return new PC();
        }
        if (typeOfComputer.contains("Laptop")) {
            return new Laptop();
        }
        throw new RuntimeException("For now we do not made this computer " + typeOfComputer);
    }
}
