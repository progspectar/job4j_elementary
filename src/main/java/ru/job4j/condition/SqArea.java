package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        int p = 4;
        int k = 1;
        double result1 = SqArea.square(p, k);
        System.out.println(" p = " + p + ", k = " + k + ", s = 1, real = " + result1);

        p = 6;
        k = 2;
        result1 = SqArea.square(p, k);
        System.out.println(" p = " + p + ", k = " + k + ", s = 2, real = " + result1);
    }
}
