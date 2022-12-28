package LibraryDataBase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainCsvDataBase {

    public static void MainDataBase(){
        //InFileDataBase db = new InFileDataBase();

        List<Book> books = new ArrayList<>();
        books.add(new Book(1L,"Metro 2033", "1234", LocalDate.of(1900, 7, 1),new Author("Dimitri", "Gluchowski")));
        books.add(new Book(2L,"Władca Pierścieni tom 1", "2221", LocalDate.of(1954, 7, 29), new Author("J.R.R.", "Tolkien")));
        //books.add(new Book(null, null, null, null, null));
        CsvOperation.push(books);
        try{
            //db.add(books);
        }catch (IllegalArgumentException e){
            System.out.println("ISBN Double - cannot add record");
        }
        //System.out.println("Find by ISBN: " + db.findByIsbn("2221"));
        //System.out.println("Find by author: " + db.findByAuthor(new Author("Henryk", "Sienkiewicz")));
        //System.out.println("Find by Title: " + db.findByTitle("Metro 2033"));
    }
}
