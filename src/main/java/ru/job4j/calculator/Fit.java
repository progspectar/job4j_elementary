package ru.job4j.calculator;

public class Fit {

    static final float COEFFICIENT = 1.15f;

    public static double manWeight(short height) {
        return (height - 100) * COEFFICIENT;
    }

    public static double womanWeight(short height) {
        return (height - 110) * COEFFICIENT;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
    }

}
