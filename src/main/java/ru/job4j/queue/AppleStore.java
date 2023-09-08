package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        if (queue.size() < count) {
            return "";
        }
        String res = "";
        for (int i = 0; i < count; i++) {
            res = queue.poll().name();
        }
        return res;
    }

    public String getFirstUpsetCustomer() {
        if (queue.size() < count + 1) {
            return "";
        }
        String res = "";
        for (int i = 0; i < count + 1; i++) {
            res = queue.poll().name();
        }
        return res;
    }
}