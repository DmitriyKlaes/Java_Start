package ru.Geekbrains;

import java.util.TreeMap;

public class Lec05_TreeMap {
    public static void main(String[] args) {

        // В момент добавления пары будут упорядочиваться по ключу
        // Если упорядочевание не требуется, то лучше использовать HashMap
        // При работе с сылочными типами (классами) нужно обязательно определять логику упорядочивания

        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); System.out.println(tMap);
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}

        /*
        Как и HashMap, TreeMap имплементирует интерфейс Map,
        а это значит, что в TreeMap есть все те методы, что и в HashMap.
        Но вдобавок TreeMap реализует интерфейсы SortedMap и NavigableMap,
        получая дополнительный функционал из них.

        put(K,V) – добавить пару если или изменить значение,если ключ имеется.
        get(K) - получение значения по указанному ключу.
        remove(K) – удаляет пару по указанному ключу.

        SortedMap — интерфейс, который расширяет Map и добавляет методы,
        актуальные для отсортированного набора данных:

        firstKey(): возвращает ключ первого элемента мапы;
        lastKey(): возвращает ключ последнего элемента;
        headMap(K end): возвращает мапу, которая содержит все элементы текущей,
        от начала до элемента с ключом end;

        tailMap(K start): возвращает мапу, которая содержит все элементы текущей,
        начиная с элемента start и до конца;

        subMap(K start, K end): возвращает мапу, которая содержит все элементы текущей,
        начиная с элемента start и до элемента с ключом end.

        NavigableMap — интерфейс, который расширяет SortedMap
        и добавляет методы для навигации между элементами мапы:

        firstEntry(): возвращает первый пару “ключ-значение”;
        lastEntry(): возвращает последнюю пару “ключ-значение”;
        pollFirstEntry(): возвращает и удаляет первую пару;
        pollLastEntry(): возвращает и удаляет последнюю пару;
        ceilingKey(K obj): возвращает наименьший ключ k, который больше или равен ключу obj.
        Если такого ключа нет, возвращает null;

        floorKey(K obj): возвращает самый большой ключ k, который меньше или равен ключу obj.
        Если такого ключа нет, возвращает null;

        lowerKey(K obj): возвращает наибольший ключ k, который меньше ключа obj.
        Если такого ключа нет, возвращает null;

        higherKey(K obj): возвращает наименьший ключ k, который больше ключа obj.
        Если такого ключа нет, возвращает null;

        ceilingEntry(K obj): аналогичен методу ceilingKey(K obj),
        только возвращает пару “ключ-значение” (или null);

        floorEntry(K obj): аналогичен методу floorKey(K obj),
        только возвращает пару “ключ-значение” (или null);

        lowerEntry(K obj): аналогичен методу lowerKey(K obj),
        только возвращает пару “ключ-значение” (или null);

        higherEntry(K obj): аналогичен методу higherKey(K obj),
        только возвращает пару “ключ-значение” (или null);

        descendingKeySet(): возвращает NavigableSet,
        содержащий все ключи, отсортированные в обратном порядке;

        descendingMap(): возвращает NavigableMap,
        содержащую все пары, отсортированные в обратном порядке;

        navigableKeySet(): возвращает объект NavigableSet,
        содержащий все ключи в порядке хранения;

        headMap(K upperBound, boolean incl): возвращает мапу,
        которая содержит пары от начала и до элемента upperBound.
        Аргумент incl указывает, нужно ли включать элемент upperBound в возвращаемую мапу;

        tailMap(K lowerBound, boolean incl): функционал похож на предыдущий метод,
        только возвращаются пары от lowerBound и до конца;

        subMap(K lowerBound, boolean lowIncl, K upperBound, boolean highIncl):
        как и в предыдущих методах, возвращаются пары от lowerBound и до upperBound,
        аргументы lowIncl и highIncl указывают, включать ли граничные элементы в новую мапу.

        В самой же реализации TreeMap, кроме привычных нам конструкторов,
        добавляется еще один, который принимает экземпляр компаратора.
        Этот компаратор и будет отвечать за порядок хранения элементов.
         */

        /*
        Видео с разъяснениями про красно-черные деревья
        1  https://www.youtube.com/watch?v=a9EwBVLQ364
        2  https://www.youtube.com/watch?v=n7Y2karbxF4&t=6s
        3  https://www.happycoders.eu/algorithms/red-black-tree-java/
        4  https://www.youtube.com/watch?v=u-ilAwbJWYc - детальное объяснение класса TreeMap
        */
    }
}
