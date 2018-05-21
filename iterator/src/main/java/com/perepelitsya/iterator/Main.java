package com.perepelitsya.iterator;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        User andrii = new User("A", "12");
        User baba = new User("B", "16");
        User cace = new User("C", "18");
        User dido = new User("D", "22");

        HashMap<Integer, User> map = new HashMap<>();
        map.put(1, andrii);
        map.put(2, baba);
        map.put(3, cace);
        map.put(4, dido);

        CustomCollection userCollection = new CustomCollection(map);

        //get our custom iterator for user collection
        Iterator iterator = userCollection.getIterator();

        User user = iterator.madeUserVeryStrange("A");

        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());

        System.out.println("User with name: " + user.getName() + " and age =" + user.getAge());
    }
}
