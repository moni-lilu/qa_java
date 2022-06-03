package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void shouldHaveOneKitten() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int expectedKitten = 1;

        int actualKitten = lion.getKittens();

        Assert.assertEquals(expectedKitten, actualKitten);
    }

    @Test
    public void shouldHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expectedHaveMane = true;

        boolean actualHaveMane = lion.doesHaveMane();

        Assert.assertEquals(expectedHaveMane, actualHaveMane);
    }

    @Test
    public void shouldReturnException() throws Exception {
        Exception actual = assertThrows(Exception.class, ()->(new Lion("Саме", feline)).doesHaveMane());
        Exception expected = new Exception("Используйте допустимые значения пола животного - самец или самка");

        Assert.assertEquals(expected.getMessage(), actual.getMessage());
    }

    @Test
    public void shouldNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expectedHaveMane = false;

        boolean actualHaveMane = lion.doesHaveMane();

        Assert.assertEquals(expectedHaveMane, actualHaveMane);
    }

    @Test
    public void shouldEatAnimalsBirdsFish() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");

        List<String> actualList = lion.getFood();

        Assert.assertEquals(expectedList, actualList);
    }
}