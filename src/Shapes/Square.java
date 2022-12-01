package Shapes;

class Square implements GeometricFigure{
    double length;



    public Square(double length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        double perimeter = (4*length);
        return perimeter;
    }

    @Override
    public double surfaceArena() {
        double surfaceArena = (length*length);
        return surfaceArena;
    }
}
