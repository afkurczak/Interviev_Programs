package LibraryDataBase;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class InMemoryDataBase implements DataBaseOperation {

    static List<Book> books = new ArrayList<>();
    static Long id = 0L;

    @Override
    public Long add(Book book) {
            exceptionCheck(book);
            incrementId();
            book.setId(id);
            books.add(book);
            return id;
    }

    @Override
    public Book getById(Long id) {
        for (Book book: books){
            if (book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }

    @Override
    public Book findByIsbn(String isbn) {
        for (Book nextBook : books) {
            if (isbn.equals(nextBook.getIsbn())) {
                return nextBook;
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
        for (Book nextBook: books) {
            if (book.getIsbn().equals(nextBook.getIsbn())) throw new IllegalArgumentException();
        }
    }
}
