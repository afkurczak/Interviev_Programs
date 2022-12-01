package Shapes;

class Circle extends FigureWithToString{
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

}
