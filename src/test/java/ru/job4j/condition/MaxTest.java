package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax10To2Then10() {
        int result = new Max().max(10, 2);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To20To30Then30() {
        int result = new Max().max(1, 20, 30);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15T1To4To5Then5() {
        int result = new Max().max(15, 1, 4, 5);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1To1To1Then1() {
        int result = new Max().max(1, 1, 1, 1);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}