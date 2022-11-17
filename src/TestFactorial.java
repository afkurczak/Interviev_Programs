public class TestFactorial {

    public static boolean testFactorial(long compareNumber, int testForNumber){
        if (Factorial.factorial(testForNumber) == compareNumber) return true;
        else return false;
    }
}
