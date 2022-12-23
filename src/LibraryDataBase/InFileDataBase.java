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
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());
        for (Book book: books) {
            if (book.getId().equals(id)) return book;
        }
        return null;
    }

    @Override
    public Book findByIsbn(String isbn) {
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());
        for (Book book: books) {
            if (book.getIsbn().equals(isbn)) return book;
        }
        return null;
    }

    @Override
    public List<Book> findByAuthor(Author author) {
        List <Book>findByAuthor = new ArrayList<>();
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());
        for (Book book: books) {
            if (book.getAuthor().equals(author)) findByAuthor.add(book);
                return findByAuthor;
        }
        return null;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List <Book>findByTitle = new ArrayList<>();
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());
        for (Book book: books) {
            if (book.getTitle().equals(title)) findByTitle.add(book);
            return findByTitle;
        }
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
