package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void shouldEatAnimalsBirdsFish() throws Exception {
        Feline feline = new Feline();
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");

        List<String> actualList = feline.eatMeat();

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnFeline() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        String actualFamily = feline.getFamily();

        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void shouldReturnOneKitten() {
        Feline feline = new Feline();
        int expectedKitten = 1;

        int actualKitten = feline.getKittens();

        Assert.assertEquals(expectedKitten, actualKitten);
    }
}