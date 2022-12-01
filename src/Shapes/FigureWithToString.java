package Shapes;

abstract class FigureWithToString implements GeometricFigure{

    @Override
    public String toString(){
        String className = getClass().getSimpleName();
        String shapeName = (className + " / Surface arena = " + surfaceArena() +" / Perimeter = "+perimeter());
        return shapeName;
    }
}
