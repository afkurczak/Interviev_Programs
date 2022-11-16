public class MyString {

    public String reverseTxt(String inputTxt) {
        String outputTxt = "";
        int loop = inputTxt.length();
        for (int i = 0; i < loop; i++) {
            outputTxt += inputTxt.charAt(loop - 1 - i);
        }
        return outputTxt;
    }
}

