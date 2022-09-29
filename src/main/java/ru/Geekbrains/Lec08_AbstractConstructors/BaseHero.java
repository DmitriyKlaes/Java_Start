package ru.Geekbrains.Lec08_AbstractConstructors;

public abstract class BaseHero {
    int hp;

    public BaseHero(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
        this.hp = hp;
    }

    public BaseHero() {
        this("", 0);
        System.out.println("Вызван BaseHero()");
    }
}
