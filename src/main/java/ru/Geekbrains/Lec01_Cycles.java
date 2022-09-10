package ru.Geekbrains;

public class Lec01_Cycles {
    public static void main(String[] args) {
        /*
        Операторы для управления циклами — continue и break.
        Выполнение следующей итерации цикла — continue.
        Прерывание текущей итерации цикла — break.
        */

        int value = 321;
        int count = 0;

        // Цикл while

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        //Цикл do while (цикл с постусловием)
        //Сначала будет "что-то" делать, потом будет "что-то" проверять

        value = 321;
        count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);

        // Цикл for

        int s = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue; // Если условие совпадает,
                                      // то выполняется оператор continue и цикл переходит на следующую итерацию
            s += i;
        }
        System.out.println(s);

        // Цикл в цикле (применимо ко всем сочетаниям циклов)

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *


        // Цикл foreach. Такой цикл не может работать с итерируемым объектом.
        // Только для пробега по списку/массиву

        int[] array = new int[] {1,2,3,1,4,5,6,7};
        for (int item : array) {
            System.out.println(item);
        }
        System.out.println();
    }
}
