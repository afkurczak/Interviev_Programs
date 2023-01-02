package SimpleProgram;

public class FizzBuzz {
    public static void execute (int maxNumber){
        for (int i = 1; i <= maxNumber; i++){
            if (i % 3 == 0) System.out.print("Fizz");
            if (i % 5 == 0) System.out.print("Buzz");
            if (i % 5 != 0 & i % 3 != 0) System.out.print(i);
            System.out.println();
        }
    }

}
