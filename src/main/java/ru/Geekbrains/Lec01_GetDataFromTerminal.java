package ru.Geekbrains;

import java.util.Scanner;

public class Lec01_GetDataFromTerminal {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // создаем экземпляр класса Scanner
        System.out.print("name: ");
        String name = iScanner.nextLine(); // метод Scanner-а для получения следующей строки
        System.out.printf("Привет, %s!", name);

        System.out.print("\nint a: ");
        int x = iScanner.nextInt(); // метод Scanner-а для получения int значения
        System.out.print("double a: ");
        double y = iScanner.nextDouble(); // метод Scanner-а для получения double значения
        System.out.printf("%d + %f = %f", x, y, x + y);

        System.out.print("\nint a: ");
        boolean flag = iScanner.hasNextInt(); // проверка, если есть int, возвращает True или False
        System.out.println(flag);
        if (flag){
            int i = iScanner.nextInt();
            System.out.println(i);
        } else {
            System.out.println("Ну ты и банан!");
        }
        iScanner.close();
    }
}
