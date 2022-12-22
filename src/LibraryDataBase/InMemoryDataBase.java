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
        for (Book book : books) {
            if (isbn.equals(book.getIsbn())) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findByAuthor(Author author){
        List <Book> listFindByAuthor = new ArrayList<>();
        for (Book book: books){
            if (book.getAuthor().equals(author)) {
                listFindByAuthor.add(book);
            }
        }
        return listFindByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title){
        List <Book> listFindByTitle = new ArrayList<>();
        for (Book book: books){
            if (book.getTitle().equals(title)){
                listFindByTitle.add(book);
            }
        }
        return listFindByTitle;
    }

    @Override
    public boolean deleteById(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                return true;
            }
        }
            return false;
    }

    @Override
    public boolean updateById(Long id, Book book) {
        Long searchId = 0L;
        for (Book book1 : books) {
            if (book1.getId().equals(id)) {
                searchId = book1.getId();
                System.out.println("dupa");
                break;
            }
        }
        if (searchId>0) {
            book.setId(id);
            books.set(searchId.intValue() - 1, book);
            return true;
        }
        return false;
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
