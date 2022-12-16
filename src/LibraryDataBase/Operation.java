package LibraryDataBase;

import java.time.LocalDate;

public interface Operation  {
    Book add(Long id, String title, String isbn, LocalDate date, Author author);
    Book getById (Long id);
}

