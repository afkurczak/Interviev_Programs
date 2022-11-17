import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String orgTxt = new String("ABCDEFG");

        StringUtils reverse = new StringUtils();
        StringUtilsTest reverseTest = new StringUtilsTest();
        StringUtilsTest compare = new StringUtilsTest();

        String compTxt = reverse.reverseTxt(orgTxt);
        String compTxtTest = reverseTest.reverseTxtTest(orgTxt);
        boolean check = compare.isSame(compTxt,compTxtTest);

        System.out.println(compTxt);
        System.out.println(compTxtTest);
        System.out.println(check);

        //FizzBuzz.execute(100);
        System.out.println(Factorial.factorial(3));
    }
}