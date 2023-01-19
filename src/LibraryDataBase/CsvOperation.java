package LibraryDataBase;

import com.sun.jdi.LongValue;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
                writer.write(line);
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("File write error");
        }
    }

    public static List<Book> pull (){
        List<Book> books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String title = parts[1];
                String isbn = parts[2];
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate releaseTime = LocalDate.parse(parts[3], formatter);
                String[] authorParts = parts[4].split(" ");
                String firstName = authorParts[0];
                String lastName = authorParts[1];
                Author author = new Author(firstName, lastName);
                Book book = new Book(Long.parseLong(id), title, isbn, releaseTime, author);
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}
