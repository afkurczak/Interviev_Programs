package LibraryDataBase;

import java.time.LocalDate;
import java.util.*;

public class MainLibraryDataBase {


    public static void MainDataBase(){
        InMemoryDataBase db = new InMemoryDataBase();

        Book book = new Book("Krzyżacy", "1111", LocalDate.of(1900,7,1), new Author("Henryk","Sienkiewicz"));
        db.add(book);

        book = new Book ("Władca Pierścieni", "2222", LocalDate.of(1954,7,29), new Author("J.R.R.","Tolkien"));
        db.add(book);

        book = new Book ("Wiedźmin", "83-7054-061-9", LocalDate.of(1993,1,1), new Author("Andrzej","Sapkowski"));
        db.add(book);

        book = new Book ("Wiedźmin", "83-7054-0619", LocalDate.of(1993,1,1), new Author("Andrzej","Sapkowski"));
        db.add(book);

        // book = new Book (null, null, null, null);
        //db.add(book);

        book = new Book ("Gra o tron", "4444", LocalDate.now(), new Author("George","Martin"));
        db.add(book);


        //Book book1 = new InMemoryDataBase().getById(1L);
        //System.out.println(book1);

        InMemoryDataBase.allDataWrite();

    }
}
