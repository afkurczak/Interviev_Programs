package LibraryDataBase;

import java.util.List;

public interface DataBaseOperation {
    Long  add(Book book);
    Book getById (Long id);
    Book findByIsbn (String isbn);
    List<Book> findByAuthor(Author author);
    List<Book> findByTitle(String title);
    boolean deleteById(Long id);
    boolean updateById(Long id, Book book);






}

