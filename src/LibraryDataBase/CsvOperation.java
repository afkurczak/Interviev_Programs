package LibraryDataBase;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvOperation {
     static String fileName = ("DataBase.csv");

    public static void insert(Book book){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            String line = (book.getId()+","+book.getTitle()+","+book.getIsbn()+","+book.getReleaseTime()+","+book.getAuthor());
            writer.newLine();
            writer.write(line);
        }catch (IOException e){
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