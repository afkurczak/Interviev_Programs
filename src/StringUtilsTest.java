public class StringUtilsTest {
    public String reverseTxtTest(String inputTxtTest) {
        String outputTxtTest = new StringBuilder (inputTxtTest).reverse().toString();
        return outputTxtTest;
    }
    public boolean isSame(String inputTxt1, String inputTxt2){
        boolean outIsSame = inputTxt1.equals(inputTxt2);
        return outIsSame;

    }
}
