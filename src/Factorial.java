public class Factorial {
    public static long factorial(int forNumber){
        if (forNumber == 0) return 1;
        else return(forNumber*factorial(forNumber-1));
    }
}
