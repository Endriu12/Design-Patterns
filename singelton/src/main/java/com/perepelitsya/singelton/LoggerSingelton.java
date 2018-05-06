package com.perepelitsya;

public class LoggerSingelton {
    private static LoggerSingelton ourInstance = new LoggerSingelton();

    public static LoggerSingelton getInstance() {
        return ourInstance;
    }

    private LoggerSingelton() {
    }

    private int count = 0;

    public void loggerInfo(){
        System.out.print("Hello");
        count++;
        System.out.println(count);
    }
}
