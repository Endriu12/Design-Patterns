package com.perepelitsya;

public class Main {
    public static void main(String[] args) {
        LoggerSingelton instance = LoggerSingelton.getInstance();
        instance.loggerInfo();


        PersonService  service = new PersonService();
        service.hi();

        instance.loggerInfo();

    }
}