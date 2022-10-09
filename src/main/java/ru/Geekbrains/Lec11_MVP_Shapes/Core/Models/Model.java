package ru.Geekbrains.Lec11_MVP_Shapes.Core.Models;

import ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.CalculateArea.Calculate;
import ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.Shapes.Canvas;
import ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.Shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate c, String canvasName) {
        panel = new Canvas(canvasName);//"Без имени (2).jpg");
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }

}
