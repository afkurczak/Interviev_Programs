package LibraryDataBase;

import java.time.LocalDate;
import java.util.*;

public class MainLibraryDataBase {


    public static void MainDataBase(){
        InMemoryDataBase db = new InMemoryDataBase();

        Book book = new Book("Krzyżacy", "1111", LocalDate.now(), new Author("Henryk","Sienkiewicz"));
        db.add(book);

        book = new Book ("Władca Pierścieni", "2222", LocalDate.now(), new Author("J.R.R.","Tolkien"));
        db.add(book);

        book = new Book ("Wiedźmin", "3333", LocalDate.now(), new Author("Andrzej","Sapkowski"));
        db.add(book);


        Book book1 = new InMemoryDataBase().getById(2L);
        System.out.println(book1);

    }
}
