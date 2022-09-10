package ru.Geekbrains;

public class Lec01_Arrays {
    public static void main(String[] args) {
        // Одномерные массивы

        int[] arrSingle = new int[10]; // 10 элементов
        System.out.println(arrSingle.length); // длина 10
        arrSingle = new int[]{1, 2, 3, 4, 5}; // Java сама определит длину массива
        System.out.println(arrSingle.length); // длина 5

        // Многомерные массивы (массивы массивов со своими особенностями)

        int[] arrMulti[] = new int[3][5]; // Можно так же определить как int[][]
        for (int[] line : arrMulti) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        //То же самое, что и выше, только другие цикли и инициализация
        int[][] arrMultiSecond= new int[3][5];
        for (int i = 0; i < arrMultiSecond.length; i++) {
            for (int j = 0; j < arrMultiSecond[i].length; j++) {
                System.out.printf("%d ", arrMultiSecond[i][j]);
            }
            System.out.println();
        }
    }
}