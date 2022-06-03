package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int numberOfKittens;
    private final int expectedNumberOfKittens;


    public FelineTest(int numberOfKittens, int expectedNumberOfKittens) {
        this.numberOfKittens = numberOfKittens;
        this.expectedNumberOfKittens = expectedNumberOfKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][] {
                { 0, 0},
                { 1, 1},
                { 100, 100},
        };
    }


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

    @Test
    public void shouldReturnNumberOfKitten() {
        Feline feline = new Feline();
        int actualNumberOfKittens = feline.getKittens(numberOfKittens);
        Assert.assertEquals(expectedNumberOfKittens, actualNumberOfKittens);
    }
}