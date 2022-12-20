package LibraryDataBase;


import java.util.ArrayList;
import java.util.List;
import java.util.function.IntToLongFunction;

public class InMemoryDataBase implements DataBaseOperation {

    static List<Book> books = new ArrayList<>();
    static Long id = 0L;

    @Override
    public Long add(Book book) {
        try {
            exceptionCheck(book);
            incrementId();
            book.setId(id);
            books.add(book);

        } catch (Exception exception) {
            System.out.println("Add Record Error");
        }return id;
    }

    @Override
    public Book getById(Long id) {
        //books.remove(1);
        for (Book book: books){
            if (book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }

    static void allDataWrite(){
        for (Book book: books){
            System.out.println(book);
        }
    }

    private static void incrementId(){
        id++;
    }

    private static void exceptionCheck (Book book) {
        if (book.getTitle() == null || book.getIsbn() == null || book.getReleaseTime() == null) throw new IllegalArgumentException();
        for (Book nextBook: books) {
            if (book.getIsbn().equals(nextBook.getIsbn())) throw new IllegalArgumentException();
        }
    }
}
