package Shapes;

class Circle implements GeometricFigure{
    double radius;


    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String figureName){

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
    @Override
    public String toString(){
        String nameTriangle = ("Triangle - Surface arena= "+ surfaceArena() +" perimeter= "+perimeter());
        return nameTriangle;
    }
}
