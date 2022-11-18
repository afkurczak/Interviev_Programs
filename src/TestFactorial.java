public class TestFactorial {
    private static long compareNumber = 6;
    private static int testForNumber = 3;
    public static boolean testFactorial(){
        if (Factorial.factorial(testForNumber) == compareNumber) return true;
        else return false;
    }
}
