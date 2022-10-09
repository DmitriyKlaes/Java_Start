package ru.Geekbrains.Lec11_MVP_Shapes.Client;

import ru.Geekbrains.Lec11_MVP_Shapes.Core.Models.Model;
import ru.Geekbrains.Lec11_MVP_Shapes.Core.Presenters.Presenter;
import ru.Geekbrains.Lec11_MVP_Shapes.Core.Views.View;
import ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.CalculateArea.CalculateArea;
import ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.Exceptions.UnacceptableValueException;

public class App {
    Presenter p;
    View ui;
    Model model;

    public App() {
        ui = new ConsoleView();
        model = new Model(CalculateArea.getInstance(), "Без имени.jpg");
        p = new Presenter(ui, model);
    }

    public void start() throws UnacceptableValueException {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - append shape\n")
                .append("2 - show shape\n")
                .append("3 - show all area\n")
                .append("0 - exit\n");


        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    p.append();
                    break;
                case "2":
                    p.show();
                    break;
                case "3":
                    p.showArea();
                    break;
                case "0":
                    return;
            }
        }
    }
}
