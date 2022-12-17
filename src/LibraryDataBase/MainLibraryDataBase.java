package LibraryDataBase;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MainLibraryDataBase implements Operation{

    @Override
    public Book add(Long id, String title, String isbn, LocalDate date, Author author ) {
        Book book = new Book(id, title, isbn, date, author);

        return book;
    }

    @Override
    public Book getById(Long id) {
        return null;
    }
    public static void Main(){


    }
}
