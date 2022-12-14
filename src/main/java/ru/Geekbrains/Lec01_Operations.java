package ru.Geekbrains;

public class Lec01_Operations {
    public static void main(String[] args) {
        /*
        Присваивание: =;
        Арифметические:
            * - умножение,
            / - деление,
            + - сложение,
            - - вычитание,
            % - остаток от деления,
            ++ - инкримент,
            -- - декримент;
        Операции сравнения: <, >, ==, !=, >=, <=;
        Логические операции:
            || - конъюнкция,
            && - дезъюнкция,
            ^ - разделительная дезъюнкция,
            ! - инверсия;
        Побитовые операции
            << - побитовый сдвиг влево,
            >> - побитовый сдвиг вправо,
            & - побитовая дезъюнкция,
            | - побитовая конъюнкция,
            ^ - побитовая разделительная дезъюнкция;
        */

        // Арифметические операции:

        int a = 123;
        a++; // Постфиксный инкримент
        --a; // Префиксный декримент
        // Приоритетность действия зависит от расположения де(инк)ремента

        //Побитовые операции:

        int b = 8;
        // 1000 - это 8 в двоичной форме
        System.out.println(b << 1); // сдвигаем на 1 бит влево
        // получится 10000 - то есть 16 в двоичной форме
        b = 18;
        // 10010 - это 18 в двоичной форме
        System.out.println(b >> 1); // сдвигаем на 1 бит вправо
        // получится 1001 - то есть 9 в двоичтой форме

        int aa = 5;
        int bb = 2;
        System.out.println(aa | bb); // будет распечатано "7"
        // Будем сравнивать побитово:
        // 101 - это aa(5) в двоичной форме
        // 010 - это bb(2) в двоичной форме
        // 111 - это результат побитовой конъюнкции или "7" в двоичной форме

        // В некоторых случаях побитовые операции будут работать быстрее скачанных библиотек
        // Однако обычная операция && или || работает быстрее в сравнениях, нежели & или |
        // двойной знак будет проверять условия поочередно, а одинарный будет проверять оба условия в любом случае
    }
}
