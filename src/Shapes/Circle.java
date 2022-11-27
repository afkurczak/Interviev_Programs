package Shapes;

class Circle implements GeometricFigure{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        double perimeter =Math.PI*2*radius;
        return perimeter;
    }

    @Override
    public double surfaceArena() {
        double surfaceArena =Math.PI*radius*radius;
        return surfaceArena;
    }
}
