package com.perepelitsya.singelton;

public class PersonService {

    LoggerSingelton instance = LoggerSingelton.getInstance();

    public void hi() {
        System.out.println("HI from service");
        instance.loggerInfo();
    }
}
