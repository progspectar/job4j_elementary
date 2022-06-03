package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax10To2Then10() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To20Then20() {
        int left = 1;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}