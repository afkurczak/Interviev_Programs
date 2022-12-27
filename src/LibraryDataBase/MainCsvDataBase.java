package LibraryDataBase;

import java.time.LocalDate;

public class MainCsvDataBase {

    public static void MainDataBase(){
        InFileDataBase db = new InFileDataBase();

        Book book = new Book("Krzyżacy", "22288", LocalDate.of(1900, 7, 1), new Author("Henryk", "Sienkiewicz"));

        try{
            db.add(book);
        }catch (IllegalArgumentException e){
            System.out.println("ISBN Double - cannot add record");
        }
        System.out.println("Find by ISBN: " + db.findByIsbn("2221"));
        System.out.println("Find by author: " + db.findByAuthor(new Author("Henryk", "Sienkiewicz")));
        System.out.println("Find by Title: " + db.findByTitle("Metro 2033"));
    }
}
