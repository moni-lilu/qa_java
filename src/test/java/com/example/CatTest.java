package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void shouldSayMeow() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";

        String actualSound = cat.getSound();

        Assert.assertEquals(expectedSound, actualSound);
    }

    @Test
    public void shouldEatAnimalsBirdsFish() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");

        List<String> actualList = cat.getFood();

        Assert.assertEquals(expectedList, actualList);
    }
}