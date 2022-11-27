package Shapes;

class Square implements GeometricFigure{
    int lenght;
    int width;

    public Square() {
    }

    public Square(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public int Circuit(int length, int width) {
        int circuit = (2*length)+(2*width);
        return circuit;
    }

    @Override
    public int SurfaceArena() {
        return 0;
    }
}
