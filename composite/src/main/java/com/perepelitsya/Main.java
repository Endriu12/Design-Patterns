package com.perepelitsya;

public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite();

        Person andrii = new Director("Andrii Perepelitsya");
        Person mykola = new Worker("Mykola");
        Person vasya = new Trainee("Nihto");

        composite.addComponent(andrii);
        composite.addComponent(mykola);
        composite.addComponent(vasya);

        Composite composite1 = new Composite();

        Person artur = new Director("arturik");
        Person gena = new Worker("Gena");
        Person misha = new Trainee("Misha");

        composite1.addComponent(artur);
        composite1.addComponent(gena);
        composite1.addComponent(misha);

        composite.addComponent(composite1);

        composite.sayHelloWithName();
    }
}
