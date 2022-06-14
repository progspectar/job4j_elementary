package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean sample = data[0];
        for (int i = 1; i < data.length; i++) {
            if (sample != data[i]) {
                return false;
            }
        }
        return result;
    }
}
