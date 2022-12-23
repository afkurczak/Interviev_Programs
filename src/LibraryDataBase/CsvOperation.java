package LibraryDataBase;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvOperation {
     static String fileName = ("DataBase.csv");

    public static void insert(Book book){
        try {
            PrintWriter write = new PrintWriter(fileName);
            write.println("dupa");
            write.close();
        }catch (FileNotFoundException ex){
            System.out.println("File write error");
        }
    }

    public static void push(List<Book> books){

    }

    public List<Book> pull (){
        List<Book> books = new ArrayList<>();

        books.add(new Book(1L,"Metro 2033", "1234", LocalDate.of(1900, 7, 1),new Author("Dimitri", "Gluchowski")));
        books.add(new Book(7L,"Władca Pierścieni tom 1", "2221", LocalDate.of(1954, 7, 29), new Author("J.R.R.", "Tolkien")));

        return books;
    }
}