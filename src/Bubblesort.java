public class Bubblesort {
    public static void sort(int originalArray[], int howManyElements){
        boolean i = true;
        int buffor = 0;
        int endSort = 0;
        do {
            endSort = 0;
            for (int j = howManyElements; j>0; j--) {
                if (originalArray[j] < originalArray[j-1]) {
                    buffor = originalArray[j];
                    originalArray[j] = originalArray[j - 1];
                    originalArray[j - 1] = buffor;
                    }else endSort++;
                }

            if (endSort == howManyElements) i = false;
        }while (i);

        for (int k = 0; k<howManyElements+1; k++){
            System.out.println(originalArray[k]);
        }
    }
}
