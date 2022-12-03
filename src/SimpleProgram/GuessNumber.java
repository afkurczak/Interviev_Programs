package SimpleProgram;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void guessNumber(){
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        int howMany = 0;
        boolean confirm = false;
        Scanner scanner = new Scanner(System.in);

        while (!confirm){
            System.out.println("Zgadnij liczbę od 1 do 100");
            int number = scanner.nextInt();
            howMany ++;
            if (number > numberToGuess) {
                System.out.println("Liczba za duża");
            }
            else if (number < numberToGuess){
                System.out.println("liczba za mała");
            }
            else if (number == numberToGuess){
                System.out.println("Zgadłeś w " + howMany + " próbach!!!");
                confirm = true;
            }
        }
    }
}
