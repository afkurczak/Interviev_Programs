package LibraryDataBase;

import java.util.ArrayList;
import java.util.List;

public class InFileDataBase implements DataBaseOperation{

    @Override
    public Long add(Book book) {
        Long id = 1L;
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());
        for (Book nextBook: books) {
            if (book.getIsbn().equals(nextBook.getIsbn())) throw new IllegalArgumentException();
        }
        if (books.size() != 0){
            Book nextBook = books.get(books.size() - 1);
            id = nextBook.getId() + 1;
        }
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
        List <Book> findByAuthor = new ArrayList<>();
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());
        for (Book book: books) {
            if (book.getAuthor().equals(author)) findByAuthor.add(book);
        }
        return findByAuthor;
    }



    @Override
    public List<Book> findByTitle(String title) {
        List <Book>findByTitle = new ArrayList<>();
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());
        for (Book book: books) {
            if (book.getTitle().equals(title)) findByTitle.add(book);
        }
        return findByTitle;
    }

    @Override
    public boolean deleteById(Long id) {
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());
        for (Book book: books) {
            if (book.getId().equals(id)) {
                books.remove(id);
                CsvOperation.push(books);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateById(Long id, Book book) {
        int searchId = 0;
        boolean changePermission = false;
        List <Book> books = new ArrayList<>();
        books.addAll(new CsvOperation().pull());

        for (Book nextBook: books) {
            if (book.getIsbn().equals(nextBook.getIsbn()) &! nextBook.getId().equals(id)) {
                throw new IllegalArgumentException();
            }

            if (nextBook.getId().equals(id)) {
                searchId = books.indexOf(nextBook);
                changePermission = true;
            }
        }

        if (changePermission) {
            book.setId(id);
            books.set(searchId, book);
            CsvOperation.push(books);
            return true;
        }
        return false;
    }

}


