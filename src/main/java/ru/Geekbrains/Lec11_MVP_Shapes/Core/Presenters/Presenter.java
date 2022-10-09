package ru.Geekbrains.Lec11_MVP_Shapes.Core.Presenters;

 
import ru.Geekbrains.Lec11_MVP_Shapes.Core.Infrastructure.Generator;
import ru.Geekbrains.Lec11_MVP_Shapes.Core.Models.Model;
import ru.Geekbrains.Lec11_MVP_Shapes.Core.Views.View;
import ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.Exceptions.UnacceptableValueException;
import ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.Shapes.Circle;
import ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.Shapes.Rectangle;
import ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.Shapes.Shape;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void append() throws UnacceptableValueException {
        view.set("1 - Circle, 2 - Rectangle");
        String response = view.get();
        Shape figure;

        switch (response) {
            case "1":
                figure = Circle.create(Generator.number(), "Circle_" + Generator.number());
                break;
            default:
                figure = Rectangle.create(
                    Generator.number(),
                    Generator.number(),
                    "Rectangle_" + Generator.number());
                break;
        }

        model.append(figure);
        view.set("ok");

    }

    public void show() {
        view.set(model.show());
    }

    public void showArea()
        {
            view.set(String.format("all Area %s", model.area()));
        }
}
