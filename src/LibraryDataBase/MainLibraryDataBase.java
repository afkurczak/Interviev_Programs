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


        book = new Book ("Wiedźmin", "83-7054-061-9", LocalDate.of(1993,1,1), new Author("Andrzej","Sapkowski"));
        db.add(book);


        book = new Book (null, null, null, null);
        db.add(book);


        book = new Book ("Gra o tron", "4444", LocalDate.of(1980,1,1), new Author("George","Martin"));
        db.add(book);

        Long recordSearch = 2L;
        if (db.getById(recordSearch) == null){
            System.out.println("Empty record");
        }
        else {
            System.out.println(db.getById(recordSearch));
        }


        System.out.println();
        InMemoryDataBase.allDataWrite();

    }
}
