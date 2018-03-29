package com.perepelitsya;


import com.perepelitsya.interfaces.GeneralInterface;
import com.perepelitsya.proxy.ProxyPresident;

public class Main {
    public static void main(String[] args) {

        GeneralInterface president = new ProxyPresident("Vasya Petrovuch");

        president.sayHello();

        //we can see that isnt a president , it is proxy
        System.out.println(president.getClass().getSimpleName());
    }
}
