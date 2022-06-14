package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int length = Math.min(word.length, pref.length);
        for (int i = 0; i < length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
