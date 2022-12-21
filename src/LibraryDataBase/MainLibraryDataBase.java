package LibraryDataBase;

import java.time.LocalDate;
import java.util.*;

public class MainLibraryDataBase {
    static InMemoryDataBase db = new InMemoryDataBase();

    private static Long createBookAndAdd (String title, String isbn, LocalDate releaseDate, String firstName, String lastName){
       Book book;
        try {
           book = new Book(title, isbn, releaseDate, new Author(firstName, lastName));
            db.add(book);
        }catch(IllegalArgumentException e){
            System.out.println("Cannot add book");
            return null;
        }
        return book.getId();
    }
    public static void MainDataBase() {
        createBookAndAdd("Krzyżacy", "1111", LocalDate.of(1900, 7, 1), "Henryk", "Sienkiewicz");
        createBookAndAdd("Władca Pierścieni", "2222", LocalDate.of(1954, 7, 29), "J.R.R.", "Tolkien");
        createBookAndAdd("Wiedźmin", "83-7054-061-9", LocalDate.of(1993, 1, 1), "Andrzej", "Sapkowski");
        createBookAndAdd("Wiedźmin", "83-7054-061-9", LocalDate.of(1993, 1, 1), "Andrzej", "Sapkowski");
        createBookAndAdd(null, null, null, null, null);
        createBookAndAdd("Gra o tron", "4444", LocalDate.of(1980, 1, 1), "George", "Martin");

        System.out.println(db.findByIsbn("2222"));


        System.out.println();
        InMemoryDataBase.allDataWrite();

    }
}
