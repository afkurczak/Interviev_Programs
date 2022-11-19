public class Main {
    public static void main(String[] args) {
        String orgTxt = new String("ABCDEFG");

        StringUtils reverse = new StringUtils();
        StringUtilsTest reverseTest = new StringUtilsTest();
        StringUtilsTest compare = new StringUtilsTest();

        String compTxt = reverse.reverseTxt(orgTxt);
        String compTxtTest = reverseTest.reverseTxtTest(orgTxt);
        boolean check = compare.isSame(compTxt,compTxtTest);

        //System.out.println(compTxt);
        //System.out.println(compTxtTest);
        //System.out.println(check);

        //FizzBuzz.execute(100);

        //System.out.println(Factorial.factorial(0));

        //System.out.println(FactorialTest.factorialTest());

        int ile = 20;
        int[] tablica = new int[ile];
        tablica[0] = 13;
        tablica[1] = 7;
        tablica[2] = 2;
        tablica[3] = 6;
        tablica[4] = 20;
        tablica[5] = 40;
        tablica[6] = 3;
        tablica[7] = 23;
        tablica[8] = 69;
        tablica[9] = 21;
        tablica[10] = 37;
        tablica[11] = 1;
        tablica[12] = 90;
        tablica[13] = 36;
        tablica[14] = 9;
        tablica[15] = 33;
        tablica[16] = 43;
        tablica[17] = 2;
        tablica[18] = 0;
        tablica[19] = 20;

        Bubblesort.sort(tablica,ile-1);
    }
}