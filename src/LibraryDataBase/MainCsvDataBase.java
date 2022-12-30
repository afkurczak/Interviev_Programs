package LibraryDataBase;

import com.sun.tools.javac.Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainCsvDataBase {
    static MainCsvDataBase db = new MainCsvDataBase();
    public static void MainDataBase(){

        List<Book> books = new ArrayList<>();
        books.addAll(CsvOperation.pull());
        for (Book book: books){
            System.out.println(book);
        }
    }
}
