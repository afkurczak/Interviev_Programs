package LibraryDataBase;


import com.sun.jdi.LongValue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntToLongFunction;

public class InMemoryDataBase implements DataBaseOperation {

    static List<Book> books = new ArrayList<>();


    @Override
    public Long add(Book book) {
        books.add(book);
        Long bookId = Long.valueOf(books.size());
        book.setId(bookId);
        return bookId;
    }

    @Override
    public Book getById(Long id) {
        Book book = books.get(id.intValue()-1);
        return book;
    }
}
