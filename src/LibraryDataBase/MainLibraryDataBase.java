package LibraryDataBase;

import java.time.LocalDate;
import java.util.*;

public class MainLibraryDataBase {


    public static void MainDataBase(){
        Book book = new Book("Krzyżacy", "1111", LocalDate.now(), new Author("Henryk","Sienkiewicz"));
        Long bookId1 = new InMemoryDataBase().add(book);

        book = new Book("Władca Pierścieni", "2222", LocalDate.now(), new Author("J.R.R.","Tolkien"));
        Long bookId2 = new InMemoryDataBase().add(book);

        System.out.println(bookId1);
        System.out.println(bookId2);

        Book book1 = new InMemoryDataBase().getById(2L);
        System.out.println(book1);




    }
}
