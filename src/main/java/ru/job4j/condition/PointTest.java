package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when35to17then2dot82() {
        double expected = 2.82;
        int x1 = 3;
        int y1 = 5;
        int x2 = 1;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when51to63then2dot23() {
        double expected = 2.23;
        int x1 = 5;
        int y1 = 1;
        int x2 = 6;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to71then3dot16() {
        double expected = 3.16;
        int x1 = 4;
        int y1 = 2;
        int x2 = 7;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
