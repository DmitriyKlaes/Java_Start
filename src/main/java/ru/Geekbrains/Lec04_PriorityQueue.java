package ru.Geekbrains;

import java.util.PriorityQueue;

public class Lec04_PriorityQueue {
    public static void main(String[] args) {
        // Наивысший приоритет имеет "наименьший" элемент
        // Сначала нужно понять как именно для "не числа" будет определен приоритет
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll()); // удаление и получение
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
