package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float dollarToEuro(float value) {
        return value * 60 / 70;
    }

    public static float euroToDollar(float value) {
        return value * 70 / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles are " + out + ". Test result : " + passed);

        in = 600;
        expected = 10;
        out =  Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println(in + " dollars are " + out + ". Test result : " + passed);

        in = 420;
        expected = 360;
        out =  Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println(in + " dollars are " + out + ". Test result : " + passed);

        in = 840;
        expected = 980;
        out =  Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println(in + " dollars are " + out + ". Test result : " + passed);
    }
}

