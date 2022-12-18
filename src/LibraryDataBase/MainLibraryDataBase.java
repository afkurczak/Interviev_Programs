package LibraryDataBase;

import java.time.LocalDate;
import java.util.*;

public class MainLibraryDataBase {


    public static void MainDataBase(){
        Book book = new Book("Krzyżacy", "1111", LocalDate.now(), new Author("Henryk","Sienkiewicz"));
        new InMemoryDataBase().add(book);

        book = new Book("Władca Pierścieni", "2222", LocalDate.now(), new Author("J.R.R.","Tolkien"));
        new InMemoryDataBase().add(book);

        book = new Book("Wiedźmin", "3333", LocalDate.now(), new Author("Andrzej","Sapkowski"));
        new InMemoryDataBase().add(book);


        Book book1 = new InMemoryDataBase().getById(3L);
        System.out.println(book1);

    }
}
