package LibraryDataBase;


import com.sun.jdi.LongValue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntToLongFunction;

public class InMemoryDataBase implements DataBaseOperation {

    static List<Book> books = new ArrayList<>();
    static Long id = 0L;

    private static void generateId(){
        id++;
    }

    @Override
    public Long add(Book book) {
        InMemoryDataBase.generateId();
        book.setId(id);
        books.add(book);
        return id;
    }

    @Override
    public Book getById(Long id) {
        Book book = books.get(id.intValue()-1);
        return book;
    }
}
