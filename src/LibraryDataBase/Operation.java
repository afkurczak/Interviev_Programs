package LibraryDataBase;

import java.time.LocalDate;

public interface Operation  {
    Long  add(Book book);
    Book getById (Long id);
}

