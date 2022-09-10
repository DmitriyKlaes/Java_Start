package ru.Geekbrains;

public class Lec01_Transformations {
    public static void main(String[] args) {
        // Неявное преобразование - это когда мы не указываем что во что мы преобразуем
        // Явное преобразование - это когда явно есть указание во что преобразовывать

        int i = 123; double d = i; // Неявное преобразование (в тим double можно положить тип int)
        System.out.println(i);  // 123
        System.out.println(d);  // 123.0
        d = 3.1415; i = (int) d; // Неявное преобразование через каст (просто рубит значение без округления)
        System.out.println(d);  // 3.1415
        System.out.println(i);  // 3

        byte b = Byte.parseByte("123"); // Явное преобразование через класс "обертку"
        System.out.println(b);  // 123

        // тут будет ошибка, потому что байт хранит значения от 0 до 255
//        b = Byte.parseByte("1234");
//        System.out.println(b);  // NumberFormatException: Value out of range
    }
}
