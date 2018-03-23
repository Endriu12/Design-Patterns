package com.perepelitsya;

public class Main {
    public static void main(String[] args) {
        MonitorFeatures adapter = new MonitorAdapter();
        adapter.playGames();
        adapter.showFilm();
    }
}
