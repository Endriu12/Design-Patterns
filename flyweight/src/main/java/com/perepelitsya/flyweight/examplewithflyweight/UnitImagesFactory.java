package com.perepelitsya.flyweight.examplewithflyweight;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

//flyweight
class UnitImagesFactory {
    public static HashMap<String, BufferedImage> images = new HashMap();

    public static BufferedImage createThiefImage() throws IOException {
        if (images.isEmpty()) {
            images.put("Thief", ImageIO.read(
                    new File("./flyweight/src/main/resources/Thief.jpg")));
        }
        return images.get("Thief");
    }
}
