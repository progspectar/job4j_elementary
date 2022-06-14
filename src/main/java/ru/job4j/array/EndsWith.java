package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int startPosition = word.length - post.length;
        for (int i = 0; i < post.length; i++) {
            if (word[i + startPosition] != post[i]) {
                result = false;
                break;
            }

        }
        return result;
    }
}
