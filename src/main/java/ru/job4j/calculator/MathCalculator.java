package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubtractAndDivide(double first, double second) {
        return sum(subtract(first, second), divide(first, second));
    }

    public static double sumOfAllOperations(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + subtract(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply(10, 20) равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета sumSubtractAndDivide(10, 20) равен: " + sumSubtractAndDivide(10, 20));
        System.out.println("Результат расчета sumOfAllOperations(10, 20) равен: " + sumOfAllOperations(10, 20));

    }
}
