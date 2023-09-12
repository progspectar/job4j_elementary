package ru.job4j.array;

public class AlgoArray {

    private String test; /* safdf a */

    public static void swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int len = array.length;
        do {
            int newn = 0;
            for (int i = 1; i < len; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
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
