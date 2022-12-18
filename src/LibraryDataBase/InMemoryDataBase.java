package LibraryDataBase;


public class InMemoryDataBase implements DataBaseOperation {
    @Override
    public Long add(Book book) {
        Long bookId = 1L;
        return bookId;
    }

    @Override
    public Book getById(Long id) {

        return null;
    }
}
