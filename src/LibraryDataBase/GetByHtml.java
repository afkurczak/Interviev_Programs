package LibraryDataBase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetByHtml {

    static void gettingHtml() {
        String filePath = "D:/LibraryDataBase/addBook.html";
        String bookTitle = GetByHtml.getBookTitle(filePath);
        System.out.println(bookTitle);
    }

    public static String getBookTitle(String filePath) {
        String bookTitle = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("bookTitle")) {
                    // Pobierz zawartość zmiennej bookTitle
                    int startIndex = line.indexOf("bookTitle") + 11;
                    int endIndex = line.indexOf(";", startIndex);
                    if (endIndex > startIndex) {
                        bookTitle = line.substring(startIndex, endIndex);
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bookTitle;
    }
}

