package ru.Geekbrains;

public class Lec01_DataTypes {
    public static void main(String[] args) {
        // Примитивные типы данных:

        byte b = 1; // Занимает 1 байт
        short s = 10; // Занимает 2 байта
        int i = 123456; // Занимает 4 байта
        long l = 13546487; // Занимает 8 байт
        float f = 1.28f; // Вещественный тип, суффикс f обязателен! Занимает 4 байта
        double dou = 1.34534; // Вещественный тип, по умолчанию числа с точкой есть double. Занимает 8 байт
        char ch = 'd'; // Отдельный символ, одинарные ковычки
        char ch1 = 123; // Неявное преобразование int в char... будем символ из utf-16 под номером 123
        boolean bo = true; // Логический тип данных

        // String не является совсем примитивным типом данных
        // При инициализации переменной данного типа не понятно сколько памяти для него потребуется

        String str = "Hello world"; // Не все очевидно... его изучить отдельно

        // Неявная типизация:

        var vi = 123; // var воспримит это как int
        var vd = 123.456; // var воспримит это как double
        // В дальнейшем заданный переменные будут является не var, а типами переменных, которые там были изначально
        System.out.println(getType(vi));
        System.out.println(getType(vd));
//        vd = "mistake";
//        error: incompatible types:
//        String cannot be converted to double

        // Для тоступа к рассширенному функционалу типа используются классы обертки:
        // Через точку мы обращаемся к объекту (классу или примитиву), с которым работаем.

//        int - Integer;
//        short - Short;
//        long - Long;
//        byte - Byte;
//        float - Float;
//        double - Double;
//        char - Character;
//        boolean - Boolean;
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
