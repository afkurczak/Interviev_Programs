public class StringUtilsTest {
    public String reverseTxtTest(String inputTxtTest) {
        StringBuilder outputTxtTest = new StringBuilder (inputTxtTest).reverse();
        String outputTxtTestStr = new StringBuilder(outputTxtTest).toString();
        return outputTxtTestStr;
    }
    public boolean isSame(String inputTxt1, String inputTxt2){
        boolean outIsSame = inputTxt1.equals(inputTxt2);
        return outIsSame;

    }
}
