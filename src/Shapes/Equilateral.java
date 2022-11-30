package Shapes;

import MyStack.Triangle;

public class Equilateral extends Triangle {
    double length;

    public Equilateral(double length) {
        super(2,3,4);
        this.length = length;
    }


    public double perimeter() {
        double perimeter = length*3;
        return perimeter;
    }


    public double surfaceArena() {
        double surfaceArena=(length*length*Math.sqrt(3))/4;
        return surfaceArena;
    }
}
