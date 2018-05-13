package com.perepelitsya.singelton;

public class LoggerSingelton {
    private static LoggerSingelton ourInstance = new LoggerSingelton();
    private int count = 0;

    private LoggerSingelton() {
    }

    public static LoggerSingelton getInstance() {
        return ourInstance;
    }

    public void loggerInfo() {
        System.out.print("Hello");
        count++;
        System.out.println(count);
    }
}
