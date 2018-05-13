package com.perepelitsya.chainofresponsibility;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        JuniorJavaDeveloper andrii = new JuniorJavaDeveloper(null);
        JuniorUIDeveloper tanya = new JuniorUIDeveloper(andrii);
        JuniorQA ivan = new JuniorQA(tanya);

        List<String> issues = Arrays
                .asList("ui - create form of regitration",
                        "develop - autorization",
                        "develop - authentication",
                        "test - registration page",
                        "ui - log out",
                        "test - log out");

        issues.forEach(ivan::handleProblem);

    }
}
