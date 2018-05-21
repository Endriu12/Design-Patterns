package com.perepelitsya.iterator;

interface Iterator {

    boolean hasNext();

    User next();

    User madeUserVeryStrange(String name);
}
