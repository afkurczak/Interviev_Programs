package LibraryDataBase;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntToLongFunction;

public class InFileDataBase implements DataBaseOperation{

    @Override
    public Long add(Book book) {
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());
        for (Book nextBook: books) {
            if (book.getIsbn().equals(nextBook.getIsbn())) throw new IllegalArgumentException();
        }
        Book nextBook = books.get(books.size()-1);
        Long id = nextBook.getId()+1;
        book.setId(id);
        CsvOperation.insert(book);
        return id;
    }

    @Override
    public Book getById(Long id) {
        return null;
    }

    @Override
    public Book findByIsbn(String isbn) {
        return null;
    }

    @Override
    public List<Book> findByAuthor(Author author) {
        return null;
    }

    @Override
    public List<Book> findByTitle(String title) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public boolean updateById(Long id, Book book) {
        return false;
    }

    private void exceptionCheck(Book book){
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());
        for (Book nextBook: books) {
            if (book.getIsbn().equals(nextBook.getIsbn())) throw new IllegalArgumentException();
        }
    }

}
