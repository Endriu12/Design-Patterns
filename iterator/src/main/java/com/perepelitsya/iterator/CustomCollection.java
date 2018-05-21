package com.perepelitsya.iterator;

import java.util.HashMap;
import java.util.Map;

class CustomCollection implements Collection {

    Map<Integer, User> list = new HashMap<>();

    public CustomCollection(Map<Integer, User> list) {
        this.list = list;
    }

    @Override
    public Iterator getIterator() {
        return new UserIterator(list);
    }
}