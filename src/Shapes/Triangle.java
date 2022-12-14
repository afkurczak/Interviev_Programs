package Shapes;

import Shapes.GeometricFigure;

public class Triangle extends FigureWithToString {
    public double length1;
    public double length2;
    public double length3;


    public Triangle(double length1, double length2, double length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }


    @Override
    public double perimeter() {
        double perimeter = length1 + length2 + length3;
        return perimeter;
    }

    @Override
    public double surfaceArena() {
        double halfPerimeter = perimeter() / 2;
        double surfaceArena = Math.sqrt(halfPerimeter*(halfPerimeter-length1)*(halfPerimeter-length2)*(halfPerimeter-length3));
        return halfPerimeter;
    }
}
