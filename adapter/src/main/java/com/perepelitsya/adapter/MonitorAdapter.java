package com.perepelitsya.adapter;

public class MonitorAdapter extends Monitor implements MonitorFeatures {

    public void showFilm() {
        show4k();
    }

    public void playGames() {
        showHighQuality();
    }
}
