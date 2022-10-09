package ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.CalculateArea;

import ru.Geekbrains.Lec11_MVP_Shapes.Mathematics.Shapes.Shape;

public interface Calculate {
    double visit(Shape shape);
}
