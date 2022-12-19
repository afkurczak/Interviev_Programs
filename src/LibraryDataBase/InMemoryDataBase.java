package LibraryDataBase;


import com.sun.jdi.LongValue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntToLongFunction;

public class InMemoryDataBase implements DataBaseOperation {

    static List<Book> books = new ArrayList<>();
    static Long Id = 0L;

    private static void generateId(){
        Id++;
    }

    @Override
    public Long add(Book book) {
        //Long bookId = Long.valueOf(books.size());
        InMemoryDataBase.generateId();
        book.setId(Id);
        books.add(book);
        return Id;
    }

    @Override
    public Book getById(Long id) {
        Book book = books.get(id.intValue()-1);
        return book;
    }
}
