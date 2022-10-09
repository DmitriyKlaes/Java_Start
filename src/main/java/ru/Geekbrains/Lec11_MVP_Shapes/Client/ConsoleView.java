package ru.Geekbrains.Lec11_MVP_Shapes.Client;

import java.util.Scanner;

import ru.Geekbrains.Lec11_MVP_Shapes.Core.Views.View;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);

    }
}
