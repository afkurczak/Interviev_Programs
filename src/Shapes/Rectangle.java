package Shapes;

class Rectangle implements GeometricFigure{
    double length;
    double weigth;


    public Rectangle(double length, double weigth) {
        this.length = length;
        this.weigth = weigth;
    }

    @Override
    public double perimeter() {
        double perimeter = (2*length)+(2*weigth);
        return perimeter;
    }

    @Override
    public double surfaceArena() {
        double surfaceArena = (length*weigth);
        return surfaceArena;
    }
}
