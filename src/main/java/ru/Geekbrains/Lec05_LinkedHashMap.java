package ru.Geekbrains;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lec05_LinkedHashMap {
    public static void main(String[] args) {
        /*
        «Старший брат»  коллекции HashMap, который все помнит…
        Помнит порядок добавления элементов ➜ более медлительный, нежели HashMap
        */

        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}

        // Методы этой коллекции почти все теже, что и в HashMap
        // Если что посмотри из через точку.

        /*
        Почитать про сложность алгоритмов:
        https://javarush.ru/groups/posts/2325-slozhnostjh-algoritmov
        */
    }
}
