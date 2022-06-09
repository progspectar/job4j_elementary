package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "John Smith";
        names[1] = "John Doe";
        names[2] = "Richard Roe";
        names[3] = "Ashok Kumar";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
