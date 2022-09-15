package ru.Geekbrains;

import java.util.HashMap;
import java.util.Map;

public class Lec05_HashMap {
    public static void main(String[] args) {
        /*
        Map – это множество коллекций, работающих с данными по принципу <Ключ / Значение>.

        Ключевые особенности:

        В HashMap элементы располагаются как угодно и могут менять свое положение.
            допускаются только уникальные ключи, значения могут повторяться;
            помните про null значения*;
            ускоренная обработка данных;
            порядок добавления не запоминается.
        */

        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(null, "!null");
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        //db.remove(null);
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet());
        System.out.println(db.values());

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }

        Map<Integer, String> db1 = new HashMap<>();
        Map<Integer, String> db2 = new HashMap<>();
        db1.putIfAbsent(1, "один");
        db1.putIfAbsent(1, "sdf");
        db1.put(1, "один"); System.out.println(db1);
        db1.put(2, "два"); System.out.println(db1);
        db1.put(3, "три"); System.out.println(db1);
        db2.put(31, "три один"); System.out.println(db2);
        db2.put(13, "один три"); System.out.println(db2);
        db2.put(2, "два два"); System.out.println(db2);
        db2.put(null, "!null"); System.out.println(db2);
        db2.put(null, null); System.out.println(db2);
        db1.putAll(db2);
        System.out.println(db1);

        // Скорость работы...
        Map<Integer,String> map1 = new HashMap<>(); // будет выделено стандартное кол-во памяти
        Map<Integer,String> map2 = new HashMap<>(30); // определенное кол-во памяти
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f);
                                            // определенное кол-во памяти
                                            // а так же процентаж, до которого надо заполнять этот Map,
                                            // после приодоления которого будет добавлена пямять.
                                            // -- В данном случае будет добавлена память после заполнения на 80%.

        /*
        Основные методы для HashMap

        put(K,V) – добавить пару если или изменить значение,если ключ имеется.
        putAll(Map m) - объединяет два Map-а по принципу put(K,V), то есть заменит значения, если ключи совпадут
        putIfAbsent(K,V) – произвести добавление если ключ не найден.
        get(K) - получение значения по указанному ключу.
        remove(K) – удаляет пару по указанному ключу.
        containsValue(V) – проверка наличия значения.
        containsKey(V) – проверка наличия ключа.
        keySet() – возвращает множество ключей.
        values() – возвращает набор значений.
        entrySet() - возвращает всю коллекцию, это можно проитерировать
        isEmpty() - boolean возвращает true, если пустой и false, если нет
        size() - Возвращает количество ключ-значение отображений на этом Map.
        */

        /*
        Почитать про:
        Хэш-функции и хэш-таблицы
        Прямое связывание (хэширование с цепочками)
        Хэширование с открытой адресацией

        Теория графов:
            деревья построенные на списках
            бинарные деревья
            сбалансированные деревья
            *алгоритм балансировки дерева
            ** красно-черные деревья, деревья поиска
        */
    }
}
