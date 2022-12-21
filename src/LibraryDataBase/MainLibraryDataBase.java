package LibraryDataBase;

import java.time.LocalDate;
import java.util.*;

public class MainLibraryDataBase {


    public static void MainDataBase() {
        InMemoryDataBase db = new InMemoryDataBase();
        try{
            List <Book> testList = new ArrayList<>();
            testList.add(new Book("Krzyżacy", "1111", LocalDate.of(1900, 7, 1), new Author("Henryk", "Sienkiewicz")));
            testList.add(new Book("Władca Pierścieni", "2222", LocalDate.of(1954, 7, 29), new Author("J.R.R.", "Tolkien")));
            testList.add(new Book("Wiedźmin", "83-7054-061-9", LocalDate.of(1993, 1, 1), new Author("Andrzej", "Sapkowski")));
            //testList.add(new Book("Wiedźmin", "83-7054-061-9", LocalDate.of(1993, 1, 1), new Author("Andrzej", "Sapkowski")));
            //testList.add(new Book(null, null, null, null));
            testList.add(new Book("Gra o tron", "4444", LocalDate.of(1980, 1, 1), new Author("George", "Martin")));

        for (Book book: testList){
            db.add(book);}

        } catch (Exception exception) {
            System.out.println("Cannot add book");
        }


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
