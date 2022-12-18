package LibraryDataBase;

import java.time.LocalDate;
import java.util.*;

public class MainLibraryDataBase {


    public static void MainDataBase(){
        List<Book> bookDataBase = new ArrayList<>();
        bookDataBase.add(new Book(0L,"dupa", "1234", LocalDate.now(), new Author("Dupa", "Dupa")));
        bookDataBase.add(new Book(1L,"dupa", "1234", LocalDate.now(), new Author("Dupa", "Dupa")));
        Book book1 = new Book(3L, "e", "3", LocalDate.now(), new Author("a","s"));

        //Book bookTest = new Book()
        //Long bookTest = MainLibraryDataBase.add(book1);
        //System.out.println(bookDataBase.get(0));
        //System.out.println(bookDataBase.get(1));

    }
}
