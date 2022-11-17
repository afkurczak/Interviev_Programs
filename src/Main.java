import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String orgTxt = new String("ABCDEFG");

        StringUtils reverse = new StringUtils();
        StringUtilsTest reverseTest = new StringUtilsTest();

        String compTxt = reverse.reverseTxt(orgTxt);
        StringBuilder compTxtTest = reverseTest.reverseTxtTest(orgTxt);

        System.out.println(compTxt);
        System.out.println(compTxtTest);

        StringUtilsTest compare = new StringUtilsTest();
        boolean check = compare.isSame(compTxt,compTxtTest);
        System.out.println(check);

        FizzBuzz fizzbuzz = new FizzBuzz();
        FizzBuzz.execute(100);
    }
}