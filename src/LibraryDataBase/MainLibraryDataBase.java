package LibraryDataBase;

import java.time.LocalDate;
import java.util.*;

public class MainLibraryDataBase implements Operation{

    @Override
    public Long add(Book book ) {
        Long bookId = 1L;
        return bookId;
    }

    @Override
    public Book getById(Long id) {
        return null;
    }
    public static void Main(){
        List<Book> bookDataBase = new ArrayList<>();
        bookDataBase.add(1,new Book(1L,"dupa", "1234", LocalDate.now(), new Author("Dupa", "Dupa")));
        //bookDataBase.add ();
       // bookDataBase.put(1L, MainLibraryDataBase.());



    }
}
