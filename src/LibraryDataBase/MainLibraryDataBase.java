package LibraryDataBase;

import java.time.LocalDate;

public class MainLibraryDataBase implements Operation{

    @Override
    public Long add() {
        Long id = Integer.toUnsignedLong(2223);
        Book book = new Book(id, "dupa", "1234", LocalDate.now(), new Author("Adrian", "Fleszar"));
        return null;
    }

    @Override
    public Book getById(Long id) {
        return null;
    }

    public static void Main(){

    }
}
