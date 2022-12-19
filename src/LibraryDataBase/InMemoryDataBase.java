package LibraryDataBase;


import com.sun.jdi.LongValue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntToLongFunction;

public class InMemoryDataBase implements DataBaseOperation {

    static List<Book> books = new ArrayList<>();
    static Long id = 0L;

    private static void incrementId(){
        id++;
    }

    private boolean isSameBook (Book book) {
        for (Book nextBook: books) {
            boolean ifEqual = true;
            if (book.getIsbn().equals(nextBook.getIsbn())) return true;
        }
            return false;
    }

    @Override
    public Long add(Book book) {
        if (isSameBook(book) == true) return id;

        incrementId();
        book.setId(id);
        books.add(book);
        return id;
    }
    public static String getByIdString(Long id){
        String messageWrite = null;
        books.remove(0);

        if (books.size()<id || books.get(id.intValue()-1).equals(null)){
            messageWrite = "Rekord poza zakresem";
        }
        else {
            Book book = new InMemoryDataBase().getById(id);
            messageWrite = (book.toString());
        }
        return messageWrite;
    }
    @Override
    public Book getById(Long id) {
        Book book = books.get(id.intValue()-1);
        return book;
    }

    static void allDataWrite(){
        for (Book book: books){
            System.out.println(book);
        }
    }
}
