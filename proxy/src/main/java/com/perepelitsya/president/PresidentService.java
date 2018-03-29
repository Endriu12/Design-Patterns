package com.perepelitsya.president;

import com.perepelitsya.interfaces.GeneralInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PresidentService  implements GeneralInterface {

    String name;

    public void sayHello() {
        System.out.println("Hello. I am a President " + name);
    }
}
