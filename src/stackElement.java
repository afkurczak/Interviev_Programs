import java.util.*;


public class stackElement {
    Object[] stackElementPrev;
    Object[] stackData;

    public static void push() {
        System.out.println("Podaj co wprowadzić na stos: ");
        Scanner scanner = new Scanner(System.in);
        Object stackData = scanner.next();
    }
}

