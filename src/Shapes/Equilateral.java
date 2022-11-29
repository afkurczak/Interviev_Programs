package Shapes;

public class Equilateral implements Triangle {
    double length;

    public Equilateral(double length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        double perimeter = length*3;
        return perimeter;
    }

    @Override
    public double surfaceArena() {
        double surfaceArena=(length*length*Math.sqrt(3))/4;
        return surfaceArena;
    }
}
