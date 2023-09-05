package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when35to17then2dot82() {
        double expected = 2.82;
        Point a = new Point(3, 5);
        Point b = new Point(1, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when51to63then2dot23() {
        double expected = 2.23;
        Point a = new Point(5, 1);
        Point b = new Point(6, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to71then3dot16() {
        double expected = 3.16;
        Point a = new Point(4, 2);
        Point b = new Point(7, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1to2to3to4to5to6then5dot19() {
        double expected = 5.19;
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(4, 5, 6);
        double out = p1.distance3d(p2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
