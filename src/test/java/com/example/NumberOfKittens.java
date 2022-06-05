package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NumberOfKittens {

    private final int numberOfKittens;
    private final int expectedNumberOfKittens;

    public NumberOfKittens(int numberOfKittens, int expectedNumberOfKittens) {
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
    public void shouldReturnNumberOfKitten() {
        Feline feline = new Feline();
        int actualNumberOfKittens = feline.getKittens(numberOfKittens);
        Assert.assertEquals(expectedNumberOfKittens, actualNumberOfKittens);
    }
}
