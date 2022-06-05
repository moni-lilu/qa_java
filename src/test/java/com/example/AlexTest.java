package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class AlexTest {

    @Test
    public void shouldHaveZeroKittens() throws Exception {
        Alex alex = new Alex(new Feline());
        int expected = 0;

        int actual = alex.getKittens();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHaveMartyMelnanGloriaFriends() throws Exception {
        Alex alex = new Alex(new Feline());
        HashSet<String> expectedFriends = new HashSet<>();
        expectedFriends.add("Глория");
        expectedFriends.add("Мелман");
        expectedFriends.add("Марти");

        HashSet<String> actual = alex.getFriends();

        Assert.assertEquals(expectedFriends, actual);
    }

    @Test
    public void shouldLiveInNewYorkZoo() throws Exception {
        Alex alex = new Alex(new Feline());
        String expected = "Нью-Йоркский зоопарк";

        String actual = alex.getPlaceOfLiving();

        Assert.assertEquals(expected, actual);
    }
}