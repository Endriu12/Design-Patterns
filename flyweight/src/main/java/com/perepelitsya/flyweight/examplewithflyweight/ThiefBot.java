package com.perepelitsya.flyweight.examplewithflyweight;

import lombok.ToString;

import java.io.IOException;

@ToString
class ThiefBot extends Bot {
    ThiefBot() throws IOException {
        name = "New Thief";
        health = 100;
        picture = UnitImagesFactory.createThiefImage();
    }

}
