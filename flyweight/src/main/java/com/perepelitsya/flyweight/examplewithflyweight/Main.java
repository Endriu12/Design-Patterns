package com.perepelitsya.flyweight.examplewithflyweight;

import com.perepelitsya.service.MemoryService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by developer on 5/6/18.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<ThiefBot> bots = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            bots.add(new ThiefBot());
        }
        MemoryService.showTimePerformance();

    }
}
