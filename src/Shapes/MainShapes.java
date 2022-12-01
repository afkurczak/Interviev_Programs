package Shapes;

import MyStack.Triangle;

import java.util.ArrayList;
import java.util.List;

public class MainShapes {
    public static void listShapes(){
        List <GeometricFigure> figures = new ArrayList<>();

        figures.add(new Square(3));
        figures.add(new Rectangle(3,7));
        figures.add(new Circle(4));
        figures.add(new Triangle(3,4,5));
        figures.add(new Equilateral(4));

        for (GeometricFigure figure: figures){
            System.out.println(figure.perimeter());
            System.out.println(figure.surfaceArena());
        }
    }
    public static void mainShapes(){
        Square square = new Square(3);
        System.out.println("Kwadrat");
        System.out.println("Obwód: " + square.perimeter());
        System.out.println("Pole powierzni: " + square.surfaceArena());
        System.out.println("");
        System.out.println("Prostokąt");
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println("Obwód: " + rectangle.perimeter());
        System.out.println("Pole powierzni: " + rectangle.surfaceArena());
        System.out.println("");
        System.out.println("Okrąg");
        Circle circle = new Circle(4);
        System.out.println("Obwód: " + circle.perimeter());
        System.out.println("Pole powierzni: " + circle.surfaceArena());

    }
}
