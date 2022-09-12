package ru.Geekbrains;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lec04_Deque {
    public static void main(String[] args) {
        // Линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах.

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();
    }
}
