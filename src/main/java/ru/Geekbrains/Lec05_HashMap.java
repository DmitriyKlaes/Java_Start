package ru.Geekbrains;

import java.util.HashMap;
import java.util.Map;

public class Lec05_HashMap {
    public static void main(String[] args) {
        /*
        Map – это множество коллекций, работающих с данными по принципу <Ключ / Значение>.

        Ключевые особенности:

        В HashMap элементы располагаются как угодно и могут менять свое положение.
            допускаются только уникальные ключи, значения
            могут повторяться;
            помните про null значения*;
            ускоренная обработка данных;
            порядок добавления не запоминается.
        */

        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.putIfAbsent(1, "sdf");
        db.put(1, "один"); System.out.println(db);
        db.put(2, "два"); System.out.println(db);
        db.put(3, "три"); System.out.println(db);
        db.put(31, "три один"); System.out.println(db);
        db.put(13, "один три"); System.out.println(db);
        db.put(null, "!null"); System.out.println(db);
        db.put(null, null); System.out.println(db);

        /*
        Основные методы для HashMap

        put(K,V) – добавить пару если или изменить значение,если ключ имеется.
        putIfAbsent(K,V) – произвести добавление если ключ не найден.
        get(K) - получение значения по указанному ключу.
        remove(K) – удаляет пару по указанному ключу.
        containsValue(V) – проверка наличия значения.
        containsKey(V) – проверка наличия ключа.
        keySet() – возвращает множество ключей.
        values() – возвращает набор значений.
        */
    }
}
