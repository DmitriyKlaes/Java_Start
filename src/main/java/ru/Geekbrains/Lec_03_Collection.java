package ru.Geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec_03_Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // явно указан тип коллекции! Так быстрее!!
        List<Integer> listlist = new ArrayList<Integer>(); // List тоже может хранить конструктор ArrayList
        // ArrayList list = new ArrayList(); // Сырой тип... не обозначили тип коллекции.
        // Возникнет проблема с извлечением данных. Внутри коллекции всё элементы будут Object.
        list.add(2809);
        for (Object o : list) {
            System.out.println(o);
        }


        ArrayList<Integer> list1 = new ArrayList<Integer>(); // можно указать тип в конструкторе
        ArrayList<Integer> list2 = new ArrayList<>(); // а можно и не куазывать, потому что уже слева указали
        ArrayList<Integer> list3 = new ArrayList<>(10); // будет 10 элементов в коллекции
        System.out.println(list3);
        list3.add(123);
        ArrayList<Integer> list4 = new ArrayList<>(list3); // можем создать коллекцию на основе другой коллекции - копирование данных
        System.out.println(list4);


        // примитивные входные данные (int)
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date); // формирование коллекции из массива
        System.out.println(d); // [29, 9, 1990]


        // сложные типы на вход
        StringBuilder day1 = new StringBuilder("28");
        StringBuilder month1 = new StringBuilder("9");
        StringBuilder year1 = new StringBuilder("1990");
        List<StringBuilder> d1 = Arrays.asList(day1, month1, year1); // коллекция ссылается на тот же участок памяти, что и массив
        //по этому изменив данные в массиве, они так же изменятся в коллекции.
        System.out.println(d1); // [29, 9, 1990]
        day1 = new StringBuilder("09");
        System.out.println(d1); // [29, 09, 1990]


        // пример неизменяемой коллекции с помощью List.of
        Character value = null;
        List<Character> list7 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list7);
        list7.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list8 = List.copyOf(list7); // пример копирования коллекции List.copyOf


        // проба методов из списка ниже.
        for (int i = 0; i < 10; i++) {
            list4.add(i);
        }
        list4.add(3, 333);
        System.out.println(list4);
        int s = list4.remove(0);
        System.out.println(s);
        System.out.println(list4);
        list4.set(2, 3);
        System.out.println(list4);
    }
}

/*
 * add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
get(pos) – возвращает элемент из списка по указанной позиции
indexOf(item) – первое вхождение или -1
lastIndexOf(item) – последнее вхождение или -1
remove(pos) – удаление элемента на указанной позиции и его возвращение
set(int pos, T item) – помещает значение item элементу, который находится на позиции pos
sort(Comparator) – сортирует набор данных по правилу
subList(int start, int end) – получение набора данных от позиции start до end
clear() – очистка списка
toString() – «конвертация» списка в строку
Arrays.asList – преобразует массив в список
containsAll(col) – проверяет включение всех элементов из col
removeAll(col) – удаляет элементы, имеющиеся в col
retainAll(col) – оставляет элементы, имеющиеся в col
toArray() – конвертация списка в массив Object’ов
toArray(type array) – конвертация списка в массив type
List.copyOf(col) – возвращает копию списка на основе имеющегося
List.of(item1, item2,...) – возвращает неизменяемый список
 */