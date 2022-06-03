package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K3Square1dot17() {
        double expected = 1.17;
        int p = 5;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K8Square1dot20() {
        double expected = 1.20;
        int p = 7;
        double k = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}