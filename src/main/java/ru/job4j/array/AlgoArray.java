package ru.job4j.array;

public class AlgoArray {
    public static void swap(int index1, int index2, int[] array) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int len = array.length;
        do {
            int newn = 0;
            for (int i = 1; i < len; i++) {
                if (array[i - 1] > array[i]) {
                    swap(i - 1, i, array);
                    newn = i;
                }
            }
            len = newn;
        } while (len > 1);

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}