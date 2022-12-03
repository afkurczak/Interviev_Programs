package SimpleProgram;

public class FactorialTest {
    private static long compareNumber = 720;
    private static int testForNumber = 6;
    public static boolean factorialTest(){
        if (Factorial.factorial(testForNumber) == compareNumber) return true;
        else return false;
    }
}
