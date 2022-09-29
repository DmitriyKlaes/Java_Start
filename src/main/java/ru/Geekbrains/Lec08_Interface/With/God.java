package ru.Geekbrains.Lec08_Interface.With;

import ru.Geekbrains.Lec08_Interface.With.Healers.Healer;
import ru.Geekbrains.Lec08_Interface.With.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior {

    @Override
    public void attack(Hero target) {
        
    }

    @Override
    public void healing(Hero target) {
        
    }
}

