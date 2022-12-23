package LibraryDataBase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvOperation {

    public static void insert(Book book){
        System.out.println(book);
    }

    public static void push(List<Book> books){

    }

    public List<Book> pull (){
        List<Book> books = new ArrayList<>();

        books.add(new Book(1L,"Krzyżacy", "1111", LocalDate.of(1900, 7, 1),new Author("Henryk", "Sienkiewicz")));
        books.add(new Book(7L,"Władca Pierścieni tom 1", "2221", LocalDate.of(1954, 7, 29), new Author("J.R.R.", "Tolkien")));

        return books;
    }
}
