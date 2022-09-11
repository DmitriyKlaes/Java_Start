package ru.Geekbrains;

import java.io.IOException;
import java.util.logging.*;

public class Lec02_Logger {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Lec02_Logger.class.getName()); // Указываем имя класса для которого будет логирования
        //ConsoleHandler ch = new ConsoleHandler(); // Все ошибки из хэндлера пойдут в терминал
        FileHandler fh = new FileHandler("Lec02_Logger.txt"); // Все ошибки хэндлера пойдут в файл
        //logger.addHandler(ch);
        logger.addHandler(fh); // обязательно указать хэндлер как аргумент для логгера, что было понятно куда отправлять сообщения

        // дальше указываем формат как именно выводить сообщения
        SimpleFormatter sFormat = new SimpleFormatter(); // описываем формат
        //XMLFormatter xml = new XMLFormatter(); // используем определенный форматтер
        fh.setFormatter(sFormat); // используем описанный формат
        //fh.setFormatter(xml); // используем определенный форматтер

        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1"); // указываем уровень сообщения и само сообщение
        logger.info("Тестовое логирование 2"); // или просто без флажка уровня пишем сообщение

        /*
        Уровни важности сообщений
        INFO - Информационные
        DEBUG
        ERROR
        WARNING и др.
        */
    }
}