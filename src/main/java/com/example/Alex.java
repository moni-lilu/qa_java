package com.example;

import java.util.HashSet;

public class Alex extends Lion {
    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public HashSet<String> getFriends() {
        HashSet<String> friends = new HashSet<>();
        friends.add("Марти");
        friends.add("Глория");
        friends.add("Мелман");
        return friends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
