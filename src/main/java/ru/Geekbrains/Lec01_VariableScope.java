package ru.Geekbrains;

public class Lec01_VariableScope {
    public static void main(String[] args) {
        // Область видимости определяется фигурными скобками
        int a = 123;

        // Блок кода, который мы ограничиваем фигурными скобками:
        {
            int i = 123;
            System.out.println(i + a);
        }
        //Все что выше этого блока кода, мы можем использовать внутри него
        //Все что ниже уже не может обращаться к значениям внутри блока кода
        //После выполнения программой указанного блока кода, сборщик мусора всё из него удалит
//        System.out.println(i); ->  error: cannot find symbol

        int i = 321;
        System.out.println(i);
    }
}
