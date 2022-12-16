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

        Map<Long, Book> dataBase = new HashMap<>();
        int lastId = 0;
        Long lastIdLong = Integer.toUnsignedLong(lastId);

        dataBase.put(lastIdLong+1,new Book(lastIdLong+1, "Władca Pierścieni", "1234", LocalDate.now(), new Author("JRR", "Tolkien")));
        System.out.println(Boolean.toString(true));
    }
}
