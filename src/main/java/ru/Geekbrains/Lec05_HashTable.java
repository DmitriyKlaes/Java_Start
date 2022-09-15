package ru.Geekbrains;

import java.util.Hashtable;
import java.util.Map;

public class Lec05_HashTable {
    public static void main(String[] args) {
        /*
        «Устаревший брат»  коллекции HashMap,
        который не знает про null - не позволяет его хранить
        */

        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); //  java.lang.NullPointerException

        // Методы этой коллекции почти все теже, что и в HashMap
        // Если что посмотри из через точку.
    }
}
