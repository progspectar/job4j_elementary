package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
    }

    @Test
    public void rubleToDollar() {
    }

    @Test
    public void whenConvert0RblThen0Euro() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert600RblThen10Dlr() {
        float in = 600;
        float expected = 10;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert420DlrThen360Euro() {
        float in = 420;
        float expected = 360;
        float out = Converter.dollarToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert840DlrThen980Euro() {
        float in = 840;
        float expected = 980;
        float out = Converter.euroToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}
