import LibraryDataBase.Author;
import LibraryDataBase.Book;
import LibraryDataBase.DataBaseOperation;

import java.util.List;

public class InFileDataBase implements DataBaseOperation {

    @Override
    public Long add(Book book) {
        return null;
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
}
