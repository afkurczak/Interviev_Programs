public class StringUtilsTest {
    public StringBuilder reverseTxtTest(String inputTxtTest) {
        StringBuilder outputTxtTest = new StringBuilder(inputTxtTest);
        outputTxtTest.reverse();
        return outputTxtTest;
    }
    public boolean isSame(String inputTxt1, StringBuilder inputTxt2){
        boolean outIsSame = inputTxt1.equals(inputTxt2);
        return outIsSame;

    }
}
