package ru.Geekbrains;

public class Lec02_StringClass {
    public static void main(String[] args) {
        // Составление строк через StringBuilder гораздо быстрее
        var s = System.currentTimeMillis(); // метод для отображения колличества милисекунд
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);

        // В java строка НЕ является массивом символов!
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); // Cергей
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й")); // C,е,р,г,е,й
    }

    /*
    Методы для строк:

    concat(): объединение строк
    valueOf(): преобразует Object в строковое представление (завязан на toString())
    join(): объединяет набор строк в одну с учетом разделителя
    charAt(): получение символа по индексу
    indexOf(): первый индекс вхождения подстроки
    lastIndexOf(): последний индекс вхождения подстроки
    startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
    replace(): замена одной подстроки на другую
    trim(): удаляет начальные и конечные пробелы
    substring(): возвращает подстроку, см.аргументы
    toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
    compareTo(): сравнивает две строки
    equals(): сравнивает строки с учетом регистра
    equalsIgnoreCase(): сравнивает строки без учета регистра
    regionMatches(): сравнивает подстроки в строках
    */
}
