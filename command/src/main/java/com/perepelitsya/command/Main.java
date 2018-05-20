package com.perepelitsya.command;

class Main {
    public static void main(String[] args) {
        Editor word = new Editor();
        System.out.print("1");
        word.runEditor("copy");
        System.out.print("2");
        word.runEditor("paste");
        System.out.print("3");
        word.runEditor("cut");

        //test a history
        word.history.pop();
    }
}
