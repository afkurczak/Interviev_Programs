package LibraryDataBase;

public interface DataBaseOperation {
    Long  add(Book book);
    Book getById (Long id);
    Book findByIsbn (String isbn);




}

