package com.perepelitsya.iterator;

import java.util.HashMap;
import java.util.Map;

class UserIterator implements Iterator {

    Map<Integer, User> list = new HashMap<>();

    public UserIterator(Map<Integer, User> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        final int size = list.values().size();
        boolean match = false;
        for (int i = 1; i <= size; i++) {
            User user = list.get(i);
            if (user == null) {
                continue;
            }
            match = true;
        }
        return match;
    }

    @Override
    public User next() {
        final int size = list.values().size();
        User user = null;
        for (int i = 1; i <= size; i++) {
            user = list.get(i);
        }
        return user;
    }

    @Override
    public User madeUserVeryStrange(String name) {
        User user = null;
        for (User user1 : list.values()) {
            if (!user1.getAge().equals("12")) {
                continue;
            }
            user1.setAge("999");
            user = user1;
        }
        return user;
    }

}
