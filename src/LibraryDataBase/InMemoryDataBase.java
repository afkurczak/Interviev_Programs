package LibraryDataBase;


import java.util.ArrayList;
import java.util.List;
import java.util.function.IntToLongFunction;

public class InMemoryDataBase implements DataBaseOperation {

    static List<Book> books = new ArrayList<>();
    static Long id = 0L;

    @Override
    public Long add(Book book) {
        if (isNull(book)) return null;

        if (isSameBook(book)) return id;

        incrementId();
        book.setId(id);
        books.add(book);
        return id;
    }

    @Override
    public Book getById(Long id) {
        books.remove(1);
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

    private boolean isNull(Book book) {
        if (book.getIsbn() == null || book.getTitle() == null || book.getReleaseTime() == null || book.getAuthor() == null){
            return true;
        }
        return false;
    }
    private static void incrementId(){
        id++;
    }

    private boolean isSameBook (Book book) {
        for (Book nextBook: books) {
            if (book.getIsbn().equals(nextBook.getIsbn())) return true;
        }
        return false;
    }
}
