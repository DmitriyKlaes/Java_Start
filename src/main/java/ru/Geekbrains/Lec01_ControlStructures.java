package ru.Geekbrains;

import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Arrays;
import java.util.Scanner;

public class Lec01_ControlStructures {
    public static void main(String[] args) {
        // Условный оператор

        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
        // Дальше тоже самое, но в сокращенном варианте:
        int x = 1;
        int y = 2;
        int z = 0;
        if (x > y) z = x;
        if (y > x) z = y;
        System.out.println(z);

        // Тернарный оператор

        int f = 1;
        int g = 2;
        int min = f < g ? f : g; // Если True, то результат будет ДО двоеточия, если False, то после двоеточия
        System.out.println(min);
        // Тернарный оператор обязательно вернет значение или выполнит действие

        // Оператор выбора

        Scanner scn = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        int day = scn.nextInt();
        String text;
        switch (day) {
            case 1:
                text = "Monday";
                break;
            case 2:
                text = "Tuesday";
                break;
            case 3:
                text = "Wednesday";
                break;
            case 4:
                text = "Thursday";
                break;
            case 5:
                text = "Friday";
                break;
            case 6:
                text = "Saturday";
                break;
            case 7:
                text = "Sunday";
                break;
            default: // Блок default не обязателен... он будет выполнен, если ни один кейс не совпадет
                text = "Ну ты банан, товарищ";
                break;
        }
        System.out.println(text);
        // Код сверху может быть оформлен следующим образом:
        String superText;
        superText = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Ну ты банан, товарищ";
        };
        System.out.println(superText);
        //Еще один пример свича, когда несколько кейсов приводят к одному действию:
        int number = scn.nextInt();
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("Это числа от 1 до 7");;
                break;
            default:
                System.out.println("Это числа после 7");;
                break;
        }
        // Можно его так же записать упрощенно:
        switch (number) {
            case 1, 2, 3, 4, 5, 6, 7 -> System.out.println("Это числа от 1 до 7");
            default -> System.out.println("Это числа после 7");
        }
        scn.close();
    }
}
