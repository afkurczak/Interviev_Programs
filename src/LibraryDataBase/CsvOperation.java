package LibraryDataBase;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvOperation {
     static String fileName = "DataBase.csv";

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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Book book: books) {
                String line = (book.getId() + "," + book.getTitle() + "," + book.getIsbn() + "," + book.getReleaseTime() + "," + book.getAuthor());
                writer.newLine();
                writer.write(line);

            }
        }catch (IOException e){
            System.out.println("File write error");
        }

    }

    public List<Book> pull (){
        List<Book> books = new ArrayList<>();


        return books;
    }

    private static void buildLine(Book book, boolean append){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, append))) {
            String line = (book.getId()+","+book.getTitle()+","+book.getIsbn()+","+book.getReleaseTime()+","+book.getAuthor());
            writer.newLine();
            writer.write(line);
        }catch (IOException e){
            System.out.println("File write error");
        }
    }
    }
}