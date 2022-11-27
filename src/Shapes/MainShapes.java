package Shapes;

public class MainShapes {
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
