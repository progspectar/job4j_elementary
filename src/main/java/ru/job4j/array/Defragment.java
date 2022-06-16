package ru.job4j.array;

import java.util.Arrays;

public class Defragment {
    public static String[] compress(String[] array) {
        int counter = 0;
        for (int index = 0; index < array.length; index++) {
            counter++;
            if (array[index] == null) {
                for (int i = index + 1; i < array.length; i++) {
                    counter++;
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        break;
                    }
                }
            }
        }
        System.out.println("counter " + counter + " without redundant var (Korobeinikov Stas) " + Arrays.toString(array) + " compress() ");
        return array;
    }

    public static String[] compress1(String[] array) {
        int counter = 0;
        int pos = 0;
        for (int index = 0; index < array.length; index++) {
            counter++;
            if (array[index] == null) {
                for (int i = pos + 1; i < array.length; i++) {
                    counter++;
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        pos = i;
                        break;
                    }
                }
            }
        }
        System.out.println("counter " + counter + " with redundant var (mine) " + Arrays.toString(array) + " compress1() ");
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed",
                null, null, null, "right", null, null, "now", null, "straight", "away", null, null, null};
        String[] compressed = compress(input);
        String[] input1 = {"I", null, "wanna", null, "be", null, "compressed",
                null, null, null, "right", null, null, "now", null, "straight", "away", null, null, null};
        compress1(input1);
    }
}
