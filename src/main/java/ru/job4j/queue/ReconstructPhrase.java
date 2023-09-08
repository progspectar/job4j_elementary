package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder res = new StringBuilder();
        int length = evenElements.size();
        for (int i = 0; i < length; i++) {
            char el = evenElements.pollFirst();
            if ((i % 2) == 0) {
                res.append(el);
            }
        }
        return res.toString();
    }

    private String getDescendingElements() {
        Iterator<Character> iterator = descendingElements.descendingIterator();
        StringBuilder res = new StringBuilder();
        while (iterator.hasNext()) {
            res.append(iterator.next());
        }
        return res.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}