package com.perepelitsya.flyweight.example1;

import lombok.ToString;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@ToString
class ThiefBot extends Bot {
     ThiefBot() throws IOException {
        name = "New Thief";
        health = 100;
        picture = getPicture();
    }

     BufferedImage getPicture() throws IOException {
      return ImageIO.read(
              new File("./flyweight/src/main/resources/Thief.jpg"));
    }
}
